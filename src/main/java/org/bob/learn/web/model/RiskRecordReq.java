package org.bob.learn.web.model;

import lombok.Data;

@Data
public class RiskRecordReq {
    private String mac;

    private String sn;

    private String dmac;

    private Integer pageNum;

    private Integer pageSize;


}
