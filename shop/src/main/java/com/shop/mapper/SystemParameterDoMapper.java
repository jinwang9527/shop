/*
* 文 件 名:  SystemParameterDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:SystemParameterDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.SystemParameterDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemParameterDoMapper {
    int deleteByPrimaryKey(Long pkSystemEnumId);

    int insert(SystemParameterDo record);

    int batchInsert(@Param("records") List<SystemParameterDo> records);

    int insertSelective(SystemParameterDo record);

    SystemParameterDo selectByPrimaryKey(Long pkSystemEnumId);

    List<SystemParameterDo> selectObjectListByWhere(SystemParameterDo record);

    List<SystemParameterDo> selectByBillId(@Param("selective") SystemParameterDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(SystemParameterDo record);

    int updateByPrimaryKeySelective(SystemParameterDo record);

    int updateByPrimaryKey(SystemParameterDo record);
}