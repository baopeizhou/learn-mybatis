package org.bob.learn.dao.mapper;

import static org.bob.learn.dao.mapper.StatisticsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.bob.learn.dao.model.Statistics;
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
public interface StatisticsMapper extends BaseMapper {
    @Insert("INSERT INTO `statistics` (`mac`, `sn`, `intercept_count`) VALUES(#{mac},#{sn},'1') ON DUPLICATE KEY UPDATE intercept_count=intercept_count+1")
    int save(String mac, String sn);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.907+08:00", comments="Source Table: statistics")
    BasicColumn[] selectList = BasicColumn.columnList(sid, mac, sn, interceptCount, createTime, updateTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.895+08:00", comments="Source Table: statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.896+08:00", comments="Source Table: statistics")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.897+08:00", comments="Source Table: statistics")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Statistics> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.897+08:00", comments="Source Table: statistics")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Statistics> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.898+08:00", comments="Source Table: statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StatisticsResult")
    Optional<Statistics> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.898+08:00", comments="Source Table: statistics")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StatisticsResult", value = {
        @Result(column="sid", property="sid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mac", property="mac", jdbcType=JdbcType.VARCHAR),
        @Result(column="sn", property="sn", jdbcType=JdbcType.VARCHAR),
        @Result(column="intercept_count", property="interceptCount", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Statistics> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.899+08:00", comments="Source Table: statistics")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.9+08:00", comments="Source Table: statistics")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.9+08:00", comments="Source Table: statistics")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.901+08:00", comments="Source Table: statistics")
    default int deleteByPrimaryKey(Long sid_) {
        return delete(c -> 
            c.where(sid, isEqualTo(sid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.901+08:00", comments="Source Table: statistics")
    default int insert(Statistics record) {
        return MyBatis3Utils.insert(this::insert, record, statistics, c ->
            c.map(sid).toProperty("sid")
            .map(mac).toProperty("mac")
            .map(sn).toProperty("sn")
            .map(interceptCount).toProperty("interceptCount")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.904+08:00", comments="Source Table: statistics")
    default int insertMultiple(Collection<Statistics> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, statistics, c ->
            c.map(sid).toProperty("sid")
            .map(mac).toProperty("mac")
            .map(sn).toProperty("sn")
            .map(interceptCount).toProperty("interceptCount")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.904+08:00", comments="Source Table: statistics")
    default int insertSelective(Statistics record) {
        return MyBatis3Utils.insert(this::insert, record, statistics, c ->
            c.map(sid).toPropertyWhenPresent("sid", record::getSid)
            .map(mac).toPropertyWhenPresent("mac", record::getMac)
            .map(sn).toPropertyWhenPresent("sn", record::getSn)
            .map(interceptCount).toPropertyWhenPresent("interceptCount", record::getInterceptCount)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.908+08:00", comments="Source Table: statistics")
    default Optional<Statistics> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.909+08:00", comments="Source Table: statistics")
    default List<Statistics> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.909+08:00", comments="Source Table: statistics")
    default List<Statistics> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.909+08:00", comments="Source Table: statistics")
    default Optional<Statistics> selectByPrimaryKey(Long sid_) {
        return selectOne(c ->
            c.where(sid, isEqualTo(sid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.91+08:00", comments="Source Table: statistics")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, statistics, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.91+08:00", comments="Source Table: statistics")
    static UpdateDSL<UpdateModel> updateAllColumns(Statistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sid).equalTo(record::getSid)
                .set(mac).equalTo(record::getMac)
                .set(sn).equalTo(record::getSn)
                .set(interceptCount).equalTo(record::getInterceptCount)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.911+08:00", comments="Source Table: statistics")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Statistics record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sid).equalToWhenPresent(record::getSid)
                .set(mac).equalToWhenPresent(record::getMac)
                .set(sn).equalToWhenPresent(record::getSn)
                .set(interceptCount).equalToWhenPresent(record::getInterceptCount)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.912+08:00", comments="Source Table: statistics")
    default int updateByPrimaryKey(Statistics record) {
        return update(c ->
            c.set(mac).equalTo(record::getMac)
            .set(sn).equalTo(record::getSn)
            .set(interceptCount).equalTo(record::getInterceptCount)
            .set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .where(sid, isEqualTo(record::getSid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-15T14:47:09.912+08:00", comments="Source Table: statistics")
    default int updateByPrimaryKeySelective(Statistics record) {
        return update(c ->
            c.set(mac).equalToWhenPresent(record::getMac)
            .set(sn).equalToWhenPresent(record::getSn)
            .set(interceptCount).equalToWhenPresent(record::getInterceptCount)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .where(sid, isEqualTo(record::getSid))
        );
    }
}