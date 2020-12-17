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
 * 商品颜色分类表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("commodity_color")
public class CommodityColorDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品颜色分类表id
     */
    @TableId(value = "pk_commodity_color_id", type = IdType.AUTO)
    private Long pkCommodityColorId;

    /**
     * 颜色编号
     */
    private String commodityColorNo;

    /**
     * 颜色名称
     */
    private String name;

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
