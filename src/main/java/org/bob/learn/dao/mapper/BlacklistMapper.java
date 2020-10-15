package org.bob.learn.dao.mapper;

import static org.bob.learn.dao.mapper.BlacklistDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

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
import org.bob.learn.dao.model.Blacklist;
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
public interface BlacklistMapper extends BaseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.061+08:00", comments="Source Table: blacklist")
    BasicColumn[] selectList = BasicColumn.columnList(bid, mac, sn, dmac, host, createTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.049+08:00", comments="Source Table: blacklist")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.051+08:00", comments="Source Table: blacklist")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.051+08:00", comments="Source Table: blacklist")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Blacklist> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.052+08:00", comments="Source Table: blacklist")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Blacklist> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.052+08:00", comments="Source Table: blacklist")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BlacklistResult")
    Optional<Blacklist> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.053+08:00", comments="Source Table: blacklist")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BlacklistResult", value = {
        @Result(column="bid", property="bid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mac", property="mac", jdbcType=JdbcType.VARCHAR),
        @Result(column="sn", property="sn", jdbcType=JdbcType.VARCHAR),
        @Result(column="dmac", property="dmac", jdbcType=JdbcType.VARCHAR),
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Blacklist> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.054+08:00", comments="Source Table: blacklist")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.054+08:00", comments="Source Table: blacklist")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, blacklist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.055+08:00", comments="Source Table: blacklist")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, blacklist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.055+08:00", comments="Source Table: blacklist")
    default int deleteByPrimaryKey(Long bid_) {
        return delete(c -> 
            c.where(bid, isEqualTo(bid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.056+08:00", comments="Source Table: blacklist")
    default int insert(Blacklist record) {
        return MyBatis3Utils.insert(this::insert, record, blacklist, c ->
            c.map(bid).toProperty("bid")
            .map(mac).toProperty("mac")
            .map(sn).toProperty("sn")
            .map(dmac).toProperty("dmac")
            .map(host).toProperty("host")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.058+08:00", comments="Source Table: blacklist")
    default int insertMultiple(Collection<Blacklist> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, blacklist, c ->
            c.map(bid).toProperty("bid")
            .map(mac).toProperty("mac")
            .map(sn).toProperty("sn")
            .map(dmac).toProperty("dmac")
            .map(host).toProperty("host")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.058+08:00", comments="Source Table: blacklist")
    default int insertSelective(Blacklist record) {
        return MyBatis3Utils.insert(this::insert, record, blacklist, c ->
            c.map(bid).toPropertyWhenPresent("bid", record::getBid)
            .map(mac).toPropertyWhenPresent("mac", record::getMac)
            .map(sn).toPropertyWhenPresent("sn", record::getSn)
            .map(dmac).toPropertyWhenPresent("dmac", record::getDmac)
            .map(host).toPropertyWhenPresent("host", record::getHost)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.062+08:00", comments="Source Table: blacklist")
    default Optional<Blacklist> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, blacklist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.062+08:00", comments="Source Table: blacklist")
    default List<Blacklist> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, blacklist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.063+08:00", comments="Source Table: blacklist")
    default List<Blacklist> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, blacklist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.063+08:00", comments="Source Table: blacklist")
    default Optional<Blacklist> selectByPrimaryKey(Long bid_) {
        return selectOne(c ->
            c.where(bid, isEqualTo(bid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.064+08:00", comments="Source Table: blacklist")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, blacklist, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.064+08:00", comments="Source Table: blacklist")
    static UpdateDSL<UpdateModel> updateAllColumns(Blacklist record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bid).equalTo(record::getBid)
                .set(mac).equalTo(record::getMac)
                .set(sn).equalTo(record::getSn)
                .set(dmac).equalTo(record::getDmac)
                .set(host).equalTo(record::getHost)
                .set(createTime).equalTo(record::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.064+08:00", comments="Source Table: blacklist")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Blacklist record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bid).equalToWhenPresent(record::getBid)
                .set(mac).equalToWhenPresent(record::getMac)
                .set(sn).equalToWhenPresent(record::getSn)
                .set(dmac).equalToWhenPresent(record::getDmac)
                .set(host).equalToWhenPresent(record::getHost)
                .set(createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.065+08:00", comments="Source Table: blacklist")
    default int updateByPrimaryKey(Blacklist record) {
        return update(c ->
            c.set(mac).equalTo(record::getMac)
            .set(sn).equalTo(record::getSn)
            .set(dmac).equalTo(record::getDmac)
            .set(host).equalTo(record::getHost)
            .set(createTime).equalTo(record::getCreateTime)
            .where(bid, isEqualTo(record::getBid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:34:47.066+08:00", comments="Source Table: blacklist")
    default int updateByPrimaryKeySelective(Blacklist record) {
        return update(c ->
            c.set(mac).equalToWhenPresent(record::getMac)
            .set(sn).equalToWhenPresent(record::getSn)
            .set(dmac).equalToWhenPresent(record::getDmac)
            .set(host).equalToWhenPresent(record::getHost)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .where(bid, isEqualTo(record::getBid))
        );
    }
}