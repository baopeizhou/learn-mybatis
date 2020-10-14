package org.bob.learn.dao.mapper;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatisticsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:50:40.964+08:00", comments="Source Table: an_statistics")
    public static final Statistics statistics = new Statistics();

    /**
     * Database Column Remarks:
     *   统计记录标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:50:40.965+08:00", comments="Source field: an_statistics.sid")
    public static final SqlColumn<Long> sid = statistics.sid;

    /**
     * Database Column Remarks:
     *   家庭网关mac
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:50:40.965+08:00", comments="Source field: an_statistics.mac")
    public static final SqlColumn<String> mac = statistics.mac;

    /**
     * Database Column Remarks:
     *   家庭网关sn
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:50:40.965+08:00", comments="Source field: an_statistics.sn")
    public static final SqlColumn<String> sn = statistics.sn;

    /**
     * Database Column Remarks:
     *   拦截次数
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:50:40.965+08:00", comments="Source field: an_statistics.intercept_count")
    public static final SqlColumn<Long> interceptCount = statistics.interceptCount;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:50:40.965+08:00", comments="Source field: an_statistics.create_time")
    public static final SqlColumn<LocalDateTime> createTime = statistics.createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:50:40.965+08:00", comments="Source field: an_statistics.update_time")
    public static final SqlColumn<LocalDateTime> updateTime = statistics.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-14T10:50:40.965+08:00", comments="Source Table: an_statistics")
    public static final class Statistics extends SqlTable {
        public final SqlColumn<Long> sid = column("sid", JDBCType.BIGINT);

        public final SqlColumn<String> mac = column("mac", JDBCType.VARCHAR);

        public final SqlColumn<String> sn = column("sn", JDBCType.VARCHAR);

        public final SqlColumn<Long> interceptCount = column("intercept_count", JDBCType.BIGINT);

        public final SqlColumn<LocalDateTime> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalDateTime> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public Statistics() {
            super("an_statistics");
        }
    }
}