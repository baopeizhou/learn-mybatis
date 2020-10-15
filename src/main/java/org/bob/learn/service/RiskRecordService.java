package org.bob.learn.service;

import org.bob.learn.dao.model.RiskRecord;
import org.bob.learn.web.model.RiskRecordReq;

import java.util.List;

public interface RiskRecordService {

    void addRiskRecord();

    List<RiskRecord> listRiskRecord(RiskRecordReq riskRecordReq);
}
