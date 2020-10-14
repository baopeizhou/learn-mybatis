package org.bob.learn.service.impl;

import org.bob.learn.dao.mapper.StatisticsMapper;
import org.bob.learn.dao.model.Statistics;
import org.bob.learn.service.StaticsService;
import org.springframework.stereotype.Service;
import static org.bob.learn.dao.mapper.StatisticsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import javax.annotation.Resource;

@Service
public class StaticsServiceImpl implements StaticsService {

    @Resource
    private StatisticsMapper statisticsMapper;


    @Override
    public void saveStatistics(String macValue, String snValue){
        statisticsMapper.save(macValue,snValue);

    }

    @Override
    public Statistics getStatistics(String mac, String sn) {
        return null;
    }
}
