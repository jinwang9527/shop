package com.shop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 主次行业关联表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("industry_secondary_relation")
public class IndustrySecondaryRelationDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主次行业关联表id
     */
    @TableId(value = "pk_industry_secondary_relation_id", type = IdType.AUTO)
    private Long pkIndustrySecondaryRelationId;

    /**
     * 行业表id
     */
    private Long fkIndustryId;

    /**
     * 次级行业表id
     */
    private Long fkSecondaryIndustryId;

    /**
     * 商品类别
     */
    private Long fkClassificationId;

    /**
     * 创建人
     */
    private Long createId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 假删除:n未删除y已删除
     */
    private String isDel;


}
