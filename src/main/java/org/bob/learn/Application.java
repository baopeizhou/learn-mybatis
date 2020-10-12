package org.bob.learn;

import lombok.extern.slf4j.Slf4j;
import org.bob.learn.dao.mapper.AnBlacklistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@Slf4j
@EnableCaching
@SpringBootApplication
public class Application {




    public static void main(String[] args) {
        log.info("Mybatis应用启动开始");
        SpringApplication.run(Application.class, args);
        log.info("Mybatis应用启动成功");
    }
}
