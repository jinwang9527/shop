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
 * 订单物流记录表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("logistics_records")
public class LogisticsRecordsDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单物流记录表id
     */
    @TableId(value = "pk_logistics_records_id", type = IdType.AUTO)
    private Long pkLogisticsRecordsId;

    /**
     * 物流记录编号
     */
    private String logisticsRecordsNo;

    /**
     * 订单id
     */
    private Long fkBaseOrderId;

    /**
     * 快递id
     */
    private Long fkExpressId;

    /**
     * 收货地址
     */
    private String collectAdress;

    /**
     * 取件地址
     */
    private String pickUp;

    /**
     * 卖家电话
     */
    private String sellerPhone;

    /**
     * 买家电话
     */
    private String buyerPhone;

    /**
     * 物流备注
     */
    private String note;

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
