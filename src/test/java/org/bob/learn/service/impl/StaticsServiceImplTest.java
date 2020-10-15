package org.bob.learn.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.bob.learn.dao.model.Statistics;
import org.bob.learn.service.StaticsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class StaticsServiceImplTest {

    @Autowired
    private StaticsService staticsService;

    @Test
    void saveStatistics() {
        staticsService.saveStatistics("A1B2C3D4E5F6","A1B2C3D4E5F6");
    }

    @Test
    void getStatistics() {
       Statistics statistics =  staticsService.getStatistics("A1B2C3D4E5F6","A1B2C3D4E5F6");
       log.info(statistics.getInterceptCount().toString());
    }
}