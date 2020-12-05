/*
* 文 件 名:  IndustrySecondaryRelationDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:IndustrySecondaryRelationDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.IndustrySecondaryRelationDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndustrySecondaryRelationDoMapper {
    int deleteByPrimaryKey(Long pkIndustrySecondaryRelationId);

    int insert(IndustrySecondaryRelationDo record);

    int batchInsert(@Param("records") List<IndustrySecondaryRelationDo> records);

    int insertSelective(IndustrySecondaryRelationDo record);

    IndustrySecondaryRelationDo selectByPrimaryKey(Long pkIndustrySecondaryRelationId);

    List<IndustrySecondaryRelationDo> selectObjectListByWhere(IndustrySecondaryRelationDo record);

    List<IndustrySecondaryRelationDo> selectByBillId(@Param("selective") IndustrySecondaryRelationDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(IndustrySecondaryRelationDo record);

    int updateByPrimaryKeySelective(IndustrySecondaryRelationDo record);

    int updateByPrimaryKey(IndustrySecondaryRelationDo record);
}