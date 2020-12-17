package com.shop.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 客户资金账户表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("client_account")
public class ClientAccountDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户资金账户表id
     */
    private Long pkClientAccountId;

    /**
     * 客户资金账户编号
     */
    private String clientAccountNo;

    /**
     * 总金额
     */
    private BigDecimal clientAccountMoney;

    /**
     * 消费金额
     */
    private BigDecimal consumptionMoney;

    /**
     * 剩余金额
     */
    private BigDecimal surplusMoney;

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
