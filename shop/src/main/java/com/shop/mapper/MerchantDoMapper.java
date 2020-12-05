/*
* 文 件 名:  MerchantDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:MerchantDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.MerchantDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MerchantDoMapper {
    int deleteByPrimaryKey(Long pkMerchantsId);

    int insert(MerchantDo record);

    int batchInsert(@Param("records") List<MerchantDo> records);

    int insertSelective(MerchantDo record);

    MerchantDo selectByPrimaryKey(Long pkMerchantsId);

    List<MerchantDo> selectObjectListByWhere(MerchantDo record);

    List<MerchantDo> selectByBillId(@Param("selective") MerchantDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(MerchantDo record);

    int updateByPrimaryKeySelective(MerchantDo record);

    int updateByPrimaryKey(MerchantDo record);
}