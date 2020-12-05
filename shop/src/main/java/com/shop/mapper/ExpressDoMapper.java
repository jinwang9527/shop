/*
* 文 件 名:  ExpressDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:ExpressDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.ExpressDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExpressDoMapper {
    int deleteByPrimaryKey(Long pkExpressId);

    int insert(ExpressDo record);

    int batchInsert(@Param("records") List<ExpressDo> records);

    int insertSelective(ExpressDo record);

    ExpressDo selectByPrimaryKey(Long pkExpressId);

    List<ExpressDo> selectObjectListByWhere(ExpressDo record);

    List<ExpressDo> selectByBillId(@Param("selective") ExpressDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(ExpressDo record);

    int updateByPrimaryKeySelective(ExpressDo record);

    int updateByPrimaryKey(ExpressDo record);
}