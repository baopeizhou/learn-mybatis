package org.bob.learn.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BlacklistDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:34:23.355+08:00", comments="Source Table: an_blacklist")
    public static final Blacklist blacklist = new Blacklist();

    /**
     * Database Column Remarks:
     *   黑名单标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:34:23.355+08:00", comments="Source field: an_blacklist.bid")
    public static final SqlColumn<Long> bid = blacklist.bid;

    /**
     * Database Column Remarks:
     *   网关mac
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:34:23.355+08:00", comments="Source field: an_blacklist.mac")
    public static final SqlColumn<String> mac = blacklist.mac;

    /**
     * Database Column Remarks:
     *   网关sn
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:34:23.355+08:00", comments="Source field: an_blacklist.sn")
    public static final SqlColumn<String> sn = blacklist.sn;

    /**
     * Database Column Remarks:
     *   下挂设备mac
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:34:23.356+08:00", comments="Source field: an_blacklist.dmac")
    public static final SqlColumn<String> dmac = blacklist.dmac;

    /**
     * Database Column Remarks:
     *   网站host
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:34:23.356+08:00", comments="Source field: an_blacklist.host")
    public static final SqlColumn<String> host = blacklist.host;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:34:23.356+08:00", comments="Source field: an_blacklist.create_time")
    public static final SqlColumn<LocalDateTime> createTime = blacklist.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:34:23.355+08:00", comments="Source Table: an_blacklist")
    public static final class Blacklist extends SqlTable {
        public final SqlColumn<Long> bid = column("bid", JDBCType.BIGINT);

        public final SqlColumn<String> mac = column("mac", JDBCType.VARCHAR);

        public final SqlColumn<String> sn = column("sn", JDBCType.VARCHAR);

        public final SqlColumn<String> dmac = column("dmac", JDBCType.VARCHAR);

        public final SqlColumn<String> host = column("host", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> createTime = column("create_time", JDBCType.TIMESTAMP);

        public Blacklist() {
            super("an_blacklist");
        }
    }
}