/*
* 文 件 名:  SecondaryIndustryDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:SecondaryIndustryDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.SecondaryIndustryDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecondaryIndustryDoMapper {
    int deleteByPrimaryKey(Long pkSecondaryIndustryId);

    int insert(SecondaryIndustryDo record);

    int batchInsert(@Param("records") List<SecondaryIndustryDo> records);

    int insertSelective(SecondaryIndustryDo record);

    SecondaryIndustryDo selectByPrimaryKey(Long pkSecondaryIndustryId);

    List<SecondaryIndustryDo> selectObjectListByWhere(SecondaryIndustryDo record);

    List<SecondaryIndustryDo> selectByBillId(@Param("selective") SecondaryIndustryDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(SecondaryIndustryDo record);

    int updateByPrimaryKeySelective(SecondaryIndustryDo record);

    int updateByPrimaryKey(SecondaryIndustryDo record);
}