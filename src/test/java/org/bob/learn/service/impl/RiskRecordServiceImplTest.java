package org.bob.learn.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.bob.learn.dao.model.RiskRecord;
import org.bob.learn.service.RiskRecordService;
import org.bob.learn.web.model.RiskRecordReq;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class RiskRecordServiceImplTest {

    @Autowired
    private RiskRecordService riskRecordService;

    @Test
    void addRiskRecord() {
    }

    @Test
    void listRiskRecord() {
        RiskRecordReq req = new RiskRecordReq();
        req.setMac("00CFC0B22178");
        req.setSn("CMDC0050A553");
        req.setPageNum(1);
        req.setPageSize(10);
        List<RiskRecord> riskRecordList =riskRecordService.listRiskRecord(req);
        log.info("sadf");
    }
}