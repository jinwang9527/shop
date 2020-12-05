/*
* 文 件 名:  ClientAccountDo.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:ClientAccountDo
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ClientAccountDo implements Serializable {
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

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table client_account
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    private static final long serialVersionUID = 1L;

    public Long getPkClientAccountId() {
        return pkClientAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_account.pk_client_account_id
     *
     * @param pkClientAccountId the value for client_account.pk_client_account_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setPkClientAccountId(Long pkClientAccountId) {
        this.pkClientAccountId = pkClientAccountId;
    }

    public String getClientAccountNo() {
        return clientAccountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_account.client_account_no
     *
     * @param clientAccountNo the value for client_account.client_account_no
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setClientAccountNo(String clientAccountNo) {
        this.clientAccountNo = clientAccountNo == null ? null : clientAccountNo.trim();
    }

    public BigDecimal getClientAccountMoney() {
        return clientAccountMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_account.client_account_money
     *
     * @param clientAccountMoney the value for client_account.client_account_money
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setClientAccountMoney(BigDecimal clientAccountMoney) {
        this.clientAccountMoney = clientAccountMoney;
    }

    public BigDecimal getConsumptionMoney() {
        return consumptionMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_account.consumption_money
     *
     * @param consumptionMoney the value for client_account.consumption_money
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setConsumptionMoney(BigDecimal consumptionMoney) {
        this.consumptionMoney = consumptionMoney;
    }

    public BigDecimal getSurplusMoney() {
        return surplusMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_account.surplus_money
     *
     * @param surplusMoney the value for client_account.surplus_money
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setSurplusMoney(BigDecimal surplusMoney) {
        this.surplusMoney = surplusMoney;
    }

    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_account.create_id
     *
     * @param createId the value for client_account.create_id
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
     * This method sets the value of the database column client_account.create_time
     *
     * @param createTime the value for client_account.create_time
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
     * This method sets the value of the database column client_account.update_time
     *
     * @param updateTime the value for client_account.update_time
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
     * This method sets the value of the database column client_account.is_del
     *
     * @param isDel the value for client_account.is_del
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}