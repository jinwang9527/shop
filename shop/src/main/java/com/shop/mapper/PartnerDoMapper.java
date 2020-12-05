/*
* 文 件 名:  PartnerDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:PartnerDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.PartnerDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PartnerDoMapper {
    int deleteByPrimaryKey(Long pkPartnerId);

    int insert(PartnerDo record);

    int batchInsert(@Param("records") List<PartnerDo> records);

    int insertSelective(PartnerDo record);

    PartnerDo selectByPrimaryKey(Long pkPartnerId);

    List<PartnerDo> selectObjectListByWhere(PartnerDo record);

    List<PartnerDo> selectByBillId(@Param("selective") PartnerDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(PartnerDo record);

    int updateByPrimaryKeySelective(PartnerDo record);

    int updateByPrimaryKey(PartnerDo record);
}