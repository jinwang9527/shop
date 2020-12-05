/*
* 文 件 名:  OrderCommodityRelationDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:OrderCommodityRelationDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.OrderCommodityRelationDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderCommodityRelationDoMapper {
    int deleteByPrimaryKey(Long pkOrderCommodityRelationId);

    int insert(OrderCommodityRelationDo record);

    int batchInsert(@Param("records") List<OrderCommodityRelationDo> records);

    int insertSelective(OrderCommodityRelationDo record);

    OrderCommodityRelationDo selectByPrimaryKey(Long pkOrderCommodityRelationId);

    List<OrderCommodityRelationDo> selectObjectListByWhere(OrderCommodityRelationDo record);

    List<OrderCommodityRelationDo> selectByBillId(@Param("selective") OrderCommodityRelationDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(OrderCommodityRelationDo record);

    int updateByPrimaryKeySelective(OrderCommodityRelationDo record);

    int updateByPrimaryKey(OrderCommodityRelationDo record);
}