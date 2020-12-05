/*
* 文 件 名:  ClientDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:ClientDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.ClientDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientDoMapper {
    int deleteByPrimaryKey(Long pkClientId);

    int insert(ClientDo record);

    int batchInsert(@Param("records") List<ClientDo> records);

    int insertSelective(ClientDo record);

    ClientDo selectByPrimaryKey(Long pkClientId);

    List<ClientDo> selectObjectListByWhere(ClientDo record);

    List<ClientDo> selectByBillId(@Param("selective") ClientDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(ClientDo record);

    int updateByPrimaryKeySelective(ClientDo record);

    int updateByPrimaryKey(ClientDo record);
}