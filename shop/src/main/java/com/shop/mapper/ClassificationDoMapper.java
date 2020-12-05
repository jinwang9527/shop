/*
* 文 件 名:  ClassificationDoMapper.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:ClassificationDoMapper
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.mapper;

import com.shop.pojo.ClassificationDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassificationDoMapper {
    int deleteByPrimaryKey(Long pkClassificationId);

    int insert(ClassificationDo record);

    int batchInsert(@Param("records") List<ClassificationDo> records);

    int insertSelective(ClassificationDo record);

    ClassificationDo selectByPrimaryKey(Long pkClassificationId);

    List<ClassificationDo> selectObjectListByWhere(ClassificationDo record);

    List<ClassificationDo> selectByBillId(@Param("selective") ClassificationDo selective, @Param("ids") List<Long> ids);

    int selectCountByWhere(ClassificationDo record);

    int updateByPrimaryKeySelective(ClassificationDo record);

    int updateByPrimaryKey(ClassificationDo record);
}