package org.bob.learn.service.impl;

import org.bob.learn.dao.mapper.BlacklistMapper;
import org.bob.learn.dao.model.Blacklist;
import org.bob.learn.service.BlacklistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static org.bob.learn.dao.mapper.BlacklistDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class BlacklistServiceImpl implements BlacklistService {

    @Resource
    private BlacklistMapper blacklistMapper;

    @Override
    public void addBlacklist(String mac, String sn, String dmac, String host) {
        Blacklist blacklist = new Blacklist();
        blacklist.setMac(mac);
        blacklist.setSn(sn);
        blacklist.setDmac(dmac);
        blacklist.setHost(host);
        blacklistMapper.insertSelective(blacklist);
    }

    @Override
    public void delBlacklist(String macValue, String snValue, String dmacValue) {
        blacklistMapper.delete(c->c.where(mac,isEqualTo(macValue)).where(sn,isEqualToWhenPresent(snValue)).where(dmac,isEqualToWhenPresent(dmacValue)));
    }

    @Override
    public List<Blacklist> listBlacklist(String macValue, String snValue, String dmacValue) {
        return blacklistMapper.select(c->c.where(mac,isEqualTo(macValue)).where(sn,isEqualToWhenPresent(snValue)).where(dmac,isEqualToWhenPresent(dmacValue)));
    }

    @Override
    public Blacklist getBlacklist(Blacklist blacklist) {
        return null;
    }

}
