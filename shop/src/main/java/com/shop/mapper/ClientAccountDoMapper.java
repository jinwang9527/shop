/*
* 文 件 名:  ClientAccountDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:ClientAccountDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.ClientAccountDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientAccountDoMapper {
    int deleteByPrimaryKey(Long pkClientAccountId);

    int insert(ClientAccountDo record);

    int batchInsert(@Param("records") List<ClientAccountDo> records);

    int insertSelective(ClientAccountDo record);

    ClientAccountDo selectByPrimaryKey(Long pkClientAccountId);

    List<ClientAccountDo> selectObjectListByWhere(ClientAccountDo record);

    List<ClientAccountDo> selectByBillId(@Param("selective") ClientAccountDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(ClientAccountDo record);

    int updateByPrimaryKeySelective(ClientAccountDo record);

    int updateByPrimaryKey(ClientAccountDo record);
}