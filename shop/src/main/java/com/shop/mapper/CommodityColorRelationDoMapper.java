/*
* 文 件 名:  CommodityColorRelationDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:CommodityColorRelationDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.CommodityColorRelationDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityColorRelationDoMapper {
    int deleteByPrimaryKey(Long pkCommodityColorRelationId);

    int insert(CommodityColorRelationDo record);

    int batchInsert(@Param("records") List<CommodityColorRelationDo> records);

    int insertSelective(CommodityColorRelationDo record);

    CommodityColorRelationDo selectByPrimaryKey(Long pkCommodityColorRelationId);

    List<CommodityColorRelationDo> selectObjectListByWhere(CommodityColorRelationDo record);

    List<CommodityColorRelationDo> selectByBillId(@Param("selective") CommodityColorRelationDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(CommodityColorRelationDo record);

    int updateByPrimaryKeySelective(CommodityColorRelationDo record);

    int updateByPrimaryKey(CommodityColorRelationDo record);
}