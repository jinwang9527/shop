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
 * 订单商品关联表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order_commodity_relation")
public class OrderCommodityRelationDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单商品关联表id
     */
    @TableId(value = "pk_order_commodity_relation_id", type = IdType.AUTO)
    private Long pkOrderCommodityRelationId;

    /**
     * 订单id
     */
    private Long fkBaseOrderId;

    /**
     * 商品id
     */
    private Long fkCommodityId;

    /**
     * 购买数量
     */
    private Long number;

    /**
     * 成交金额
     */
    private BigDecimal money;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 是否结算：settlement000：未结算，settlement001：已结算
     */
    private String isSettlement;

    /**
     * 物流记录表id
     */
    private Long fkLogisticsRecordsId;

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
