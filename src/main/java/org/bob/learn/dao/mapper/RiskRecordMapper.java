package org.bob.learn.dao.mapper;

import static org.bob.learn.dao.mapper.RiskRecordDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.bob.learn.dao.model.RiskRecord;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface RiskRecordMapper extends BaseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.086+08:00", comments="Source Table: risk_record")
    BasicColumn[] selectList = BasicColumn.columnList(rid, createTime, mac, sn, dmac, dname, host, dealState, readState, updateTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.076+08:00", comments="Source Table: risk_record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.076+08:00", comments="Source Table: risk_record")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.077+08:00", comments="Source Table: risk_record")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<RiskRecord> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.077+08:00", comments="Source Table: risk_record")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<RiskRecord> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.078+08:00", comments="Source Table: risk_record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RiskRecordResult")
    Optional<RiskRecord> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.078+08:00", comments="Source Table: risk_record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RiskRecordResult", value = {
        @Result(column="rid", property="rid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP, id=true),
        @Result(column="mac", property="mac", jdbcType=JdbcType.VARCHAR),
        @Result(column="sn", property="sn", jdbcType=JdbcType.VARCHAR),
        @Result(column="dmac", property="dmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="dname", property="dname", jdbcType=JdbcType.VARCHAR),
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="deal_state", property="dealState", jdbcType=JdbcType.VARCHAR),
        @Result(column="read_state", property="readState", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<RiskRecord> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.079+08:00", comments="Source Table: risk_record")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.08+08:00", comments="Source Table: risk_record")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, riskRecord, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.08+08:00", comments="Source Table: risk_record")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, riskRecord, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.08+08:00", comments="Source Table: risk_record")
    default int deleteByPrimaryKey(Long rid_, LocalDateTime createTime_) {
        return delete(c -> 
            c.where(rid, isEqualTo(rid_))
            .and(createTime, isEqualTo(createTime_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.081+08:00", comments="Source Table: risk_record")
    default int insert(RiskRecord record) {
        return MyBatis3Utils.insert(this::insert, record, riskRecord, c ->
            c.map(rid).toProperty("rid")
            .map(createTime).toProperty("createTime")
            .map(mac).toProperty("mac")
            .map(sn).toProperty("sn")
            .map(dmac).toProperty("dmac")
            .map(dname).toProperty("dname")
            .map(host).toProperty("host")
            .map(dealState).toProperty("dealState")
            .map(readState).toProperty("readState")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.083+08:00", comments="Source Table: risk_record")
    default int insertMultiple(Collection<RiskRecord> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, riskRecord, c ->
            c.map(rid).toProperty("rid")
            .map(createTime).toProperty("createTime")
            .map(mac).toProperty("mac")
            .map(sn).toProperty("sn")
            .map(dmac).toProperty("dmac")
            .map(dname).toProperty("dname")
            .map(host).toProperty("host")
            .map(dealState).toProperty("dealState")
            .map(readState).toProperty("readState")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.083+08:00", comments="Source Table: risk_record")
    default int insertSelective(RiskRecord record) {
        return MyBatis3Utils.insert(this::insert, record, riskRecord, c ->
            c.map(rid).toPropertyWhenPresent("rid", record::getRid)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(mac).toPropertyWhenPresent("mac", record::getMac)
            .map(sn).toPropertyWhenPresent("sn", record::getSn)
            .map(dmac).toPropertyWhenPresent("dmac", record::getDmac)
            .map(dname).toPropertyWhenPresent("dname", record::getDname)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(dealState).toPropertyWhenPresent("dealState", record::getDealState)
            .map(readState).toPropertyWhenPresent("readState", record::getReadState)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.087+08:00", comments="Source Table: risk_record")
    default Optional<RiskRecord> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, riskRecord, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.087+08:00", comments="Source Table: risk_record")
    default List<RiskRecord> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, riskRecord, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.088+08:00", comments="Source Table: risk_record")
    default List<RiskRecord> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, riskRecord, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.088+08:00", comments="Source Table: risk_record")
    default Optional<RiskRecord> selectByPrimaryKey(Long rid_, LocalDateTime createTime_) {
        return selectOne(c ->
            c.where(rid, isEqualTo(rid_))
            .and(createTime, isEqualTo(createTime_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.088+08:00", comments="Source Table: risk_record")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, riskRecord, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.089+08:00", comments="Source Table: risk_record")
    static UpdateDSL<UpdateModel> updateAllColumns(RiskRecord record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(rid).equalTo(record::getRid)
                .set(createTime).equalTo(record::getCreateTime)
                .set(mac).equalTo(record::getMac)
                .set(sn).equalTo(record::getSn)
                .set(dmac).equalTo(record::getDmac)
                .set(dname).equalTo(record::getDname)
                .set(host).equalTo(record::getHost)
                .set(dealState).equalTo(record::getDealState)
                .set(readState).equalTo(record::getReadState)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.089+08:00", comments="Source Table: risk_record")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RiskRecord record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(rid).equalToWhenPresent(record::getRid)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(mac).equalToWhenPresent(record::getMac)
                .set(sn).equalToWhenPresent(record::getSn)
                .set(dmac).equalToWhenPresent(record::getDmac)
                .set(dname).equalToWhenPresent(record::getDname)
                .set(host).equalToWhenPresent(record::getHost)
                .set(dealState).equalToWhenPresent(record::getDealState)
                .set(readState).equalToWhenPresent(record::getReadState)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.09+08:00", comments="Source Table: risk_record")
    default int updateByPrimaryKey(RiskRecord record) {
        return update(c ->
            c.set(mac).equalTo(record::getMac)
            .set(sn).equalTo(record::getSn)
            .set(dmac).equalTo(record::getDmac)
            .set(dname).equalTo(record::getDname)
            .set(host).equalTo(record::getHost)
            .set(dealState).equalTo(record::getDealState)
            .set(readState).equalTo(record::getReadState)
            .set(updateTime).equalTo(record::getUpdateTime)
            .where(rid, isEqualTo(record::getRid))
            .and(createTime, isEqualTo(record::getCreateTime))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:50:06.091+08:00", comments="Source Table: risk_record")
    default int updateByPrimaryKeySelective(RiskRecord record) {
        return update(c ->
            c.set(mac).equalToWhenPresent(record::getMac)
            .set(sn).equalToWhenPresent(record::getSn)
            .set(dmac).equalToWhenPresent(record::getDmac)
            .set(dname).equalToWhenPresent(record::getDname)
            .set(host).equalToWhenPresent(record::getHost)
            .set(dealState).equalToWhenPresent(record::getDealState)
            .set(readState).equalToWhenPresent(record::getReadState)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .where(rid, isEqualTo(record::getRid))
            .and(createTime, isEqualTo(record::getCreateTime))
        );
    }
}