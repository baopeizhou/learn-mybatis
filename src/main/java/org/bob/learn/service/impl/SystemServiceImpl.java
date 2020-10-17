package org.bob.learn.service.impl;

import org.bob.learn.service.SystemService;
import org.springframework.stereotype.Service;

import javax.management.*;
import java.lang.management.ManagementFactory;

@Service
public class SystemServiceImpl implements SystemService {

    private static final float DEFAULT_HTTP_WORK_THRESHOLD = 0.8f;

    private static MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();

    
    @Override
    public boolean isOverloaded() {
        return UndertowHttpThreadMetrics.instance().isOverloaded(DEFAULT_HTTP_WORK_THRESHOLD);
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

        static {
            try {
                OBJECT_NAME_UNDERTOW_THREAD_POOL = new ObjectName("org.xnio:type=Xnio,provider=\"nio\"," + "worker=\"XNIO-2\"");
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
                return Integer.valueOf(mBeanServer.getAttribute(OBJECT_NAME_UNDERTOW_THREAD_POOL,ATTRIBUTE_BUSY_THREADS).toString());
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

        @Override
        public boolean isOverloaded(float threshold) {
            return busyThreadNum()< (maxThreadNum()* threshold);
        }
    }
}
