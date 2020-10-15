package org.bob.learn.dao.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table statistics
 */
public class Statistics {
    /**
     * Database Column Remarks:
     *   统计记录标识
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.886+08:00", comments="Source field: statistics.sid")
    private Long sid;

    /**
     * Database Column Remarks:
     *   家庭网关mac
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.889+08:00", comments="Source field: statistics.mac")
    private String mac;

    /**
     * Database Column Remarks:
     *   家庭网关sn
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.sn")
    private String sn;

    /**
     * Database Column Remarks:
     *   拦截次数
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.intercept_count")
    private Long interceptCount;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.create_time")
    private LocalDateTime createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.update_time")
    private LocalDateTime updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.889+08:00", comments="Source field: statistics.sid")
    public Long getSid() {
        return sid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.889+08:00", comments="Source field: statistics.sid")
    public void setSid(Long sid) {
        this.sid = sid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.889+08:00", comments="Source field: statistics.mac")
    public String getMac() {
        return mac;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.889+08:00", comments="Source field: statistics.mac")
    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.sn")
    public String getSn() {
        return sn;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.sn")
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.intercept_count")
    public Long getInterceptCount() {
        return interceptCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.intercept_count")
    public void setInterceptCount(Long interceptCount) {
        this.interceptCount = interceptCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.create_time")
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.create_time")
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.update_time")
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.89+08:00", comments="Source field: statistics.update_time")
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}