/*
* 文 件 名:  ClientRoleRelationDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:ClientRoleRelationDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月05日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.ClientRoleRelationDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientRoleRelationDoMapper {
    int deleteByPrimaryKey(Long pkClientRoleRelationId);

    int insert(ClientRoleRelationDo record);

    int batchInsert(@Param("records") List<ClientRoleRelationDo> records);

    int insertSelective(ClientRoleRelationDo record);

    ClientRoleRelationDo selectByPrimaryKey(Long pkClientRoleRelationId);

    List<ClientRoleRelationDo> selectObjectListByWhere(ClientRoleRelationDo record);

    List<ClientRoleRelationDo> selectByBillId(@Param("selective") ClientRoleRelationDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(ClientRoleRelationDo record);

    int updateByPrimaryKeySelective(ClientRoleRelationDo record);

    int updateByPrimaryKey(ClientRoleRelationDo record);
}