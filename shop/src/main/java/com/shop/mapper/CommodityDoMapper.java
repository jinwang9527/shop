/*
* 文 件 名:  CommodityDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:CommodityDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.CommodityDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityDoMapper {
    int deleteByPrimaryKey(Long pkCommodityId);

    int insert(CommodityDo record);

    int batchInsert(@Param("records") List<CommodityDo> records);

    int insertSelective(CommodityDo record);

    CommodityDo selectByPrimaryKey(Long pkCommodityId);

    List<CommodityDo> selectObjectListByWhere(CommodityDo record);

    List<CommodityDo> selectByBillId(@Param("selective") CommodityDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(CommodityDo record);

    int updateByPrimaryKeySelective(CommodityDo record);

    int updateByPrimaryKey(CommodityDo record);
}