package org.bob.learn.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RiskRecordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.074+08:00", comments="Source Table: risk_record")
    public static final RiskRecord riskRecord = new RiskRecord();

    /**
     * Database Column Remarks:
     *   风险网站访问记录标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.074+08:00", comments="Source field: risk_record.rid")
    public static final SqlColumn<Long> rid = riskRecord.rid;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.074+08:00", comments="Source field: risk_record.create_time")
    public static final SqlColumn<LocalDateTime> createTime = riskRecord.createTime;

    /**
     * Database Column Remarks:
     *   网关mac
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.074+08:00", comments="Source field: risk_record.mac")
    public static final SqlColumn<String> mac = riskRecord.mac;

    /**
     * Database Column Remarks:
     *   网关sn
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.074+08:00", comments="Source field: risk_record.sn")
    public static final SqlColumn<String> sn = riskRecord.sn;

    /**
     * Database Column Remarks:
     *   设备mac
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.075+08:00", comments="Source field: risk_record.dmac")
    public static final SqlColumn<String> dmac = riskRecord.dmac;

    /**
     * Database Column Remarks:
     *   设备名称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.075+08:00", comments="Source field: risk_record.dname")
    public static final SqlColumn<String> dname = riskRecord.dname;

    /**
     * Database Column Remarks:
     *   网站host
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.075+08:00", comments="Source field: risk_record.host")
    public static final SqlColumn<String> host = riskRecord.host;

    /**
     * Database Column Remarks:
     *   处置结果，0：已告警，1、已拦截，2，已放行
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.075+08:00", comments="Source field: risk_record.deal_state")
    public static final SqlColumn<String> dealState = riskRecord.dealState;

    /**
     * Database Column Remarks:
     *   阅读状态，0：未查看，1：已查看
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.075+08:00", comments="Source field: risk_record.read_state")
    public static final SqlColumn<String> readState = riskRecord.readState;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.075+08:00", comments="Source field: risk_record.update_time")
    public static final SqlColumn<LocalDateTime> updateTime = riskRecord.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.074+08:00", comments="Source Table: risk_record")
    public static final class RiskRecord extends SqlTable {
        public final SqlColumn<Long> rid = column("rid", JDBCType.BIGINT);

        public final SqlColumn<LocalDateTime> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> mac = column("mac", JDBCType.VARCHAR);

        public final SqlColumn<String> sn = column("sn", JDBCType.VARCHAR);

        public final SqlColumn<String> dmac = column("dmac", JDBCType.VARCHAR);

        public final SqlColumn<String> dname = column("dname", JDBCType.VARCHAR);

        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<String> dealState = column("deal_state", JDBCType.VARCHAR);

        public final SqlColumn<String> readState = column("read_state", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public RiskRecord() {
            super("risk_record");
        }
    }
}