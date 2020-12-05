/*
* 文 件 名:  LogisticsRecordsDo.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:LogisticsRecordsDo
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.pojo;

import java.io.Serializable;
import java.util.Date;

public class LogisticsRecordsDo implements Serializable {
    /**
     * 订单物流记录表id
     */
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

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table logistics_records
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    private static final long serialVersionUID = 1L;

    public Long getPkLogisticsRecordsId() {
        return pkLogisticsRecordsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.pk_logistics_records_id
     *
     * @param pkLogisticsRecordsId the value for logistics_records.pk_logistics_records_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setPkLogisticsRecordsId(Long pkLogisticsRecordsId) {
        this.pkLogisticsRecordsId = pkLogisticsRecordsId;
    }

    public String getLogisticsRecordsNo() {
        return logisticsRecordsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.logistics_records_no
     *
     * @param logisticsRecordsNo the value for logistics_records.logistics_records_no
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setLogisticsRecordsNo(String logisticsRecordsNo) {
        this.logisticsRecordsNo = logisticsRecordsNo == null ? null : logisticsRecordsNo.trim();
    }

    public Long getFkBaseOrderId() {
        return fkBaseOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.fk_base_order_id
     *
     * @param fkBaseOrderId the value for logistics_records.fk_base_order_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setFkBaseOrderId(Long fkBaseOrderId) {
        this.fkBaseOrderId = fkBaseOrderId;
    }

    public Long getFkExpressId() {
        return fkExpressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.fk_express_id
     *
     * @param fkExpressId the value for logistics_records.fk_express_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setFkExpressId(Long fkExpressId) {
        this.fkExpressId = fkExpressId;
    }

    public String getCollectAdress() {
        return collectAdress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.collect_adress
     *
     * @param collectAdress the value for logistics_records.collect_adress
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setCollectAdress(String collectAdress) {
        this.collectAdress = collectAdress == null ? null : collectAdress.trim();
    }

    public String getPickUp() {
        return pickUp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.pick_up
     *
     * @param pickUp the value for logistics_records.pick_up
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setPickUp(String pickUp) {
        this.pickUp = pickUp == null ? null : pickUp.trim();
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.seller_phone
     *
     * @param sellerPhone the value for logistics_records.seller_phone
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.buyer_phone
     *
     * @param buyerPhone the value for logistics_records.buyer_phone
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone == null ? null : buyerPhone.trim();
    }

    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.note
     *
     * @param note the value for logistics_records.note
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics_records.create_id
     *
     * @param createId the value for logistics_records.create_id
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
     * This method sets the value of the database column logistics_records.create_time
     *
     * @param createTime the value for logistics_records.create_time
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
     * This method sets the value of the database column logistics_records.update_time
     *
     * @param updateTime the value for logistics_records.update_time
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
     * This method sets the value of the database column logistics_records.is_del
     *
     * @param isDel the value for logistics_records.is_del
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}