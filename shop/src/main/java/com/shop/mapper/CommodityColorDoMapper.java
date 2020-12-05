/*
* 文 件 名:  CommodityColorDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:CommodityColorDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.CommodityColorDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityColorDoMapper {
    int deleteByPrimaryKey(Long pkCommodityColorId);

    int insert(CommodityColorDo record);

    int batchInsert(@Param("records") List<CommodityColorDo> records);

    int insertSelective(CommodityColorDo record);

    CommodityColorDo selectByPrimaryKey(Long pkCommodityColorId);

    List<CommodityColorDo> selectObjectListByWhere(CommodityColorDo record);

    List<CommodityColorDo> selectByBillId(@Param("selective") CommodityColorDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(CommodityColorDo record);

    int updateByPrimaryKeySelective(CommodityColorDo record);

    int updateByPrimaryKey(CommodityColorDo record);
}