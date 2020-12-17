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
 * 商户表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("merchant")
public class MerchantDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商户表id
     */
    @TableId(value = "pk_merchants_id", type = IdType.AUTO)
    private Long pkMerchantsId;

    /**
     * 商户编号
     */
    private String merchantsNo;

    /**
     * 商户名称
     */
    private String name;

    /**
     * 客户id
     */
    private Long fkClientId;

    /**
     * 商户总资金
     */
    private BigDecimal money;

    /**
     * 已提现金额
     */
    private BigDecimal noWithdrawalMoney;

    /**
     * 可提现金额（已确认收货资金）
     */
    private BigDecimal cashAdvanceMoney;

    /**
     * 冻结金额（未确认收货资金）
     */
    private BigDecimal frozenMoney;

    /**
     * 商铺开户担保金额（资质）
     */
    private BigDecimal guaranteeMoney;

    /**
     * 卖家级别：merchantsLevel000：青铜卖家，merchants_level001：白银卖家，merchants_level002：黄金卖家，	merchants_level003：钻石卖家
     */
    private String merchantsLevel;

    /**
     * 店铺商品描述评分
     */
    private String descScore;

    /**
     * 店铺服务评分
     */
    private String serviceScore;

    /**
     * 店铺物流评分
     */
    private String logisticsScore;

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
