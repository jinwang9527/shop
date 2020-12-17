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
 * 商品颜色关联表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("commodity_color_relation")
public class CommodityColorRelationDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品颜色关联表id
     */
    @TableId(value = "pk_commodity_color_relation_id", type = IdType.AUTO)
    private Long pkCommodityColorRelationId;

    /**
     * 商品表id
     */
    private Long fkCommodityId;

    /**
     * 商品颜色分类表
     */
    private Long pkCommodityColorId;

    /**
     * 库存
     */
    private Long number;

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
