/*
* 文 件 名:  BaseOrderDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:BaseOrderDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.BaseOrderDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseOrderDoMapper {
    int deleteByPrimaryKey(Long pkBaseOrderId);

    int insert(BaseOrderDo record);

    int batchInsert(@Param("records") List<BaseOrderDo> records);

    int insertSelective(BaseOrderDo record);

    BaseOrderDo selectByPrimaryKey(Long pkBaseOrderId);

    List<BaseOrderDo> selectObjectListByWhere(BaseOrderDo record);

    List<BaseOrderDo> selectByBillId(@Param("selective") BaseOrderDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(BaseOrderDo record);

    int updateByPrimaryKeySelective(BaseOrderDo record);

    int updateByPrimaryKey(BaseOrderDo record);
}