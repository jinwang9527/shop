package com.shop.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("commodity")
public class CommodityDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品表id
     */
    @TableId(value = "pk_commodity_id", type = IdType.AUTO)
    private Long pkCommodityId;

    /**
     * 商品编号
     */
    private String commodityNo;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 是否采取促销价格：n：未采用促销价格，y：已采取促销价格
     */
    private String isPromotion;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 促销价格
     */
    private String promotionPrice;

    /**
     * 销量
     */
    private Long volume;

    /**
     * 累计评价
     */
    private String evaluate;

    /**
     * 尺寸
     */
    private String size;

    /**
     * 主级行业id
     */
    private Long fkIndustryId;

    /**
     * 次级行业id
     */
    private Long fkSecondaryIndustryId;

    /**
     * 商品类别id
     */
    private Long fkClassificationId;

    /**
     * 可送积分
     */
    private Long integral;

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
