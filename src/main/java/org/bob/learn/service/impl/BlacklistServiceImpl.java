package org.bob.learn.service.impl;

import org.bob.learn.dao.mapper.AnBlacklistMapper;s
import org.bob.learn.service.BlacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static org.bob.learn.dao.mapper.AnBlacklistDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class BlacklistServiceImpl implements BlacklistService {

    @Autowired
    private AnBlacklistMapper anBlacklistMapper;

    @Override
    public void select(String macValue) {
        anBlacklistMapper.select(c-> c.where(mac,isEqualTo(macValue)));
    }
}
