/*
* 文 件 名:  OrderCommodityRelationDo.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:OrderCommodityRelationDo
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderCommodityRelationDo implements Serializable {
    /**
     * 订单商品关联表id
     */
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

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_commodity_relation
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    private static final long serialVersionUID = 1L;

    public Long getPkOrderCommodityRelationId() {
        return pkOrderCommodityRelationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.pk_order_commodity_relation_id
     *
     * @param pkOrderCommodityRelationId the value for order_commodity_relation.pk_order_commodity_relation_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setPkOrderCommodityRelationId(Long pkOrderCommodityRelationId) {
        this.pkOrderCommodityRelationId = pkOrderCommodityRelationId;
    }

    public Long getFkBaseOrderId() {
        return fkBaseOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.fk_base_order_id
     *
     * @param fkBaseOrderId the value for order_commodity_relation.fk_base_order_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setFkBaseOrderId(Long fkBaseOrderId) {
        this.fkBaseOrderId = fkBaseOrderId;
    }

    public Long getFkCommodityId() {
        return fkCommodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.fk_commodity_id
     *
     * @param fkCommodityId the value for order_commodity_relation.fk_commodity_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setFkCommodityId(Long fkCommodityId) {
        this.fkCommodityId = fkCommodityId;
    }

    public Long getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.number
     *
     * @param number the value for order_commodity_relation.number
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setNumber(Long number) {
        this.number = number;
    }

    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.money
     *
     * @param money the value for order_commodity_relation.money
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.discount
     *
     * @param discount the value for order_commodity_relation.discount
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getIsSettlement() {
        return isSettlement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.is_settlement
     *
     * @param isSettlement the value for order_commodity_relation.is_settlement
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setIsSettlement(String isSettlement) {
        this.isSettlement = isSettlement == null ? null : isSettlement.trim();
    }

    public Long getFkLogisticsRecordsId() {
        return fkLogisticsRecordsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.fk_logistics_records_id
     *
     * @param fkLogisticsRecordsId the value for order_commodity_relation.fk_logistics_records_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setFkLogisticsRecordsId(Long fkLogisticsRecordsId) {
        this.fkLogisticsRecordsId = fkLogisticsRecordsId;
    }

    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.create_id
     *
     * @param createId the value for order_commodity_relation.create_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.create_time
     *
     * @param createTime the value for order_commodity_relation.create_time
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.update_time
     *
     * @param updateTime the value for order_commodity_relation.update_time
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_commodity_relation.is_del
     *
     * @param isDel the value for order_commodity_relation.is_del
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}