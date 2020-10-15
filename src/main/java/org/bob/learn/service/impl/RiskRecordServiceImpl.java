package org.bob.learn.service.impl;

import com.github.pagehelper.PageHelper;
import org.bob.learn.dao.mapper.RiskRecordMapper;
import org.bob.learn.dao.model.RiskRecord;
import org.bob.learn.service.RiskRecordService;
import org.bob.learn.web.model.RiskRecordReq;
import org.springframework.stereotype.Service;
import static org.bob.learn.dao.mapper.RiskRecordDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RiskRecordServiceImpl implements RiskRecordService {

    @Resource
    private RiskRecordMapper riskRecordMapper;

    @Override
    public void addRiskRecord() {

    }

    @Override
    public List<RiskRecord> listRiskRecord(RiskRecordReq riskRecordReq) {
        PageHelper.startPage(riskRecordReq.getPageNum(), riskRecordReq.getPageSize());
        List<RiskRecord> list = riskRecordMapper.select(c->c.where(mac,isEqualTo(riskRecordReq.getMac())).and(sn,isEqualToWhenPresent(riskRecordReq.getSn())).and(dmac,isEqualToWhenPresent(riskRecordReq.getDmac())).orderBy(createTime.descending()));
        return list;
    }
}
