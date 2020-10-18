package org.bob.learn.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.bob.learn.service.SystemService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.management.*;
import java.lang.management.ManagementFactory;

@Slf4j
@EnableScheduling
@Service
public class SystemServiceImpl implements SystemService {

    private static final float DEFAULT_HTTP_WORK_THRESHOLD = 0.8f;

    private static MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();


    @Scheduled(cron = "5/10 * * * * ?")
    @Override
    public boolean isOverloaded() {
        boolean flag = UndertowHttpThreadMetrics.instance().isOverloaded(DEFAULT_HTTP_WORK_THRESHOLD);
        log.info(flag+"");
        return flag;
    }

    interface ServerHttpThreadMetrics{

        int maxThreadNum();

        int busyThreadNum();

        boolean isOverloaded(float threshold);

    }

    static class UndertowHttpThreadMetrics implements ServerHttpThreadMetrics {

        private static UndertowHttpThreadMetrics instance = new UndertowHttpThreadMetrics();

        private UndertowHttpThreadMetrics(){

        }

        public static UndertowHttpThreadMetrics instance(){
            return instance;
        }

        /**
         * 最大线程数属性名
         */
        private final static String ATTRIBUTE_MAX_THREADS = "MaxWorkerPoolSize";

        /**
         * 忙线程数属性名
         */
        private final static String ATTRIBUTE_BUSY_THREADS = "BusyWorkerThreadCount";


        private static ObjectName OBJECT_NAME_UNDERTOW_THREAD_POOL;

        private static int maxThreadNum;

        private static int busyThreadNum;

        static {
            try {
                OBJECT_NAME_UNDERTOW_THREAD_POOL = new ObjectName("org.xnio:type=Xnio,provider=\"nio\",worker=\"XNIO-2\"");
                maxThreadNum = Integer.valueOf(mBeanServer.getAttribute(OBJECT_NAME_UNDERTOW_THREAD_POOL,ATTRIBUTE_MAX_THREADS).toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }




        @Override
        public int maxThreadNum() {
            return maxThreadNum;
        }

        @Override
        public int busyThreadNum() {
            try {
                busyThreadNum =  Integer.valueOf(mBeanServer.getAttribute(OBJECT_NAME_UNDERTOW_THREAD_POOL,ATTRIBUTE_BUSY_THREADS).toString());
            } catch (Exception e) {
                e.printStackTrace();
                busyThreadNum = 0;
            }
            log.info(busyThreadNum+"");
            return busyThreadNum;
        }

        @Override
        public boolean isOverloaded(float threshold) {
            return busyThreadNum()> (maxThreadNum()* threshold);
        }
    }
}
