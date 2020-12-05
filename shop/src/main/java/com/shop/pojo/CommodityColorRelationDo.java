/*
* 文 件 名:  CommodityColorRelationDo.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:CommodityColorRelationDo
* 修 改 人:  Administrator
* 修改时间:  2020年12月04日
* 修改内容:  <修改内容>
*/
package com.shop.pojo;

import java.io.Serializable;
import java.util.Date;

public class CommodityColorRelationDo implements Serializable {
    /**
     * 商品颜色关联表id
     */
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

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table commodity_color_relation
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    private static final long serialVersionUID = 1L;

    public Long getPkCommodityColorRelationId() {
        return pkCommodityColorRelationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_color_relation.pk_commodity_color_relation_id
     *
     * @param pkCommodityColorRelationId the value for commodity_color_relation.pk_commodity_color_relation_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setPkCommodityColorRelationId(Long pkCommodityColorRelationId) {
        this.pkCommodityColorRelationId = pkCommodityColorRelationId;
    }

    public Long getFkCommodityId() {
        return fkCommodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_color_relation.fk_commodity_id
     *
     * @param fkCommodityId the value for commodity_color_relation.fk_commodity_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setFkCommodityId(Long fkCommodityId) {
        this.fkCommodityId = fkCommodityId;
    }

    public Long getPkCommodityColorId() {
        return pkCommodityColorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_color_relation.pk_commodity_color_id
     *
     * @param pkCommodityColorId the value for commodity_color_relation.pk_commodity_color_id
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setPkCommodityColorId(Long pkCommodityColorId) {
        this.pkCommodityColorId = pkCommodityColorId;
    }

    public Long getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_color_relation.number
     *
     * @param number the value for commodity_color_relation.number
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_color_relation.create_id
     *
     * @param createId the value for commodity_color_relation.create_id
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
     * This method sets the value of the database column commodity_color_relation.create_time
     *
     * @param createTime the value for commodity_color_relation.create_time
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
     * This method sets the value of the database column commodity_color_relation.update_time
     *
     * @param updateTime the value for commodity_color_relation.update_time
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
     * This method sets the value of the database column commodity_color_relation.is_del
     *
     * @param isDel the value for commodity_color_relation.is_del
     *
     * @mbggenerated Fri Dec 04 20:12:49 CST 2020
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}