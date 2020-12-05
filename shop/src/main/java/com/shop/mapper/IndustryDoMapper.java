/*
* 文 件 名:  IndustryDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:IndustryDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.IndustryDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndustryDoMapper {
    int deleteByPrimaryKey(Long pkIndustryId);

    int insert(IndustryDo record);

    int batchInsert(@Param("records") List<IndustryDo> records);

    int insertSelective(IndustryDo record);

    IndustryDo selectByPrimaryKey(Long pkIndustryId);

    List<IndustryDo> selectObjectListByWhere(IndustryDo record);

    List<IndustryDo> selectByBillId(@Param("selective") IndustryDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(IndustryDo record);

    int updateByPrimaryKeySelective(IndustryDo record);

    int updateByPrimaryKey(IndustryDo record);
}