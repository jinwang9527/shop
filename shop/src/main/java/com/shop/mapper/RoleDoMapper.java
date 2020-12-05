/*
* 文 件 名:  RoleDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:RoleDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月05日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.RoleDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDoMapper {
    int deleteByPrimaryKey(Long pkRoleId);

    int insert(RoleDo record);

    int batchInsert(@Param("records") List<RoleDo> records);

    int insertSelective(RoleDo record);

    RoleDo selectByPrimaryKey(Long pkRoleId);

    List<RoleDo> selectObjectListByWhere(RoleDo record);

    List<RoleDo> selectByBillId(@Param("selective") RoleDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(RoleDo record);

    int updateByPrimaryKeySelective(RoleDo record);

    int updateByPrimaryKey(RoleDo record);
}