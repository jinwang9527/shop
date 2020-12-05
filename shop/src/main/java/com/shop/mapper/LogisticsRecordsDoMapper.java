/*
* 文 件 名:  LogisticsRecordsDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:LogisticsRecordsDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.LogisticsRecordsDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogisticsRecordsDoMapper {
    int deleteByPrimaryKey(Long pkLogisticsRecordsId);

    int insert(LogisticsRecordsDo record);

    int batchInsert(@Param("records") List<LogisticsRecordsDo> records);

    int insertSelective(LogisticsRecordsDo record);

    LogisticsRecordsDo selectByPrimaryKey(Long pkLogisticsRecordsId);

    List<LogisticsRecordsDo> selectObjectListByWhere(LogisticsRecordsDo record);

    List<LogisticsRecordsDo> selectByBillId(@Param("selective") LogisticsRecordsDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(LogisticsRecordsDo record);

    int updateByPrimaryKeySelective(LogisticsRecordsDo record);

    int updateByPrimaryKey(LogisticsRecordsDo record);
}