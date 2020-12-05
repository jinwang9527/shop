/*
* 文 件 名:  ClientRoleRelationDo.java
* 版     权:  靳旺商城版
* 描     述:  数据库实体类:ClientRoleRelationDo
* 修 改 人:  Administrator
* 修改时间:  2020年12月05日
* 修改内容:  <修改内容>
*/
package com.shop.pojo;

import java.io.Serializable;
import java.util.Date;

public class ClientRoleRelationDo implements Serializable {
    /**
     * 用户角色关联id
     */
    private Long pkClientRoleRelationId;

    /**
     * 客户id
     */
    private Long fkClientId;

    /**
     * 角色id
     */
    private Long fkRoleId;

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
     * This field corresponds to the database table client_role_relation
     *
     * @mbggenerated Sat Dec 05 17:00:16 CST 2020
     */
    private static final long serialVersionUID = 1L;

    public Long getPkClientRoleRelationId() {
        return pkClientRoleRelationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_role_relation.pk_client_role_relation_id
     *
     * @param pkClientRoleRelationId the value for client_role_relation.pk_client_role_relation_id
     *
     * @mbggenerated Sat Dec 05 17:00:16 CST 2020
     */
    public void setPkClientRoleRelationId(Long pkClientRoleRelationId) {
        this.pkClientRoleRelationId = pkClientRoleRelationId;
    }

    public Long getFkClientId() {
        return fkClientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_role_relation.fk_client_id
     *
     * @param fkClientId the value for client_role_relation.fk_client_id
     *
     * @mbggenerated Sat Dec 05 17:00:16 CST 2020
     */
    public void setFkClientId(Long fkClientId) {
        this.fkClientId = fkClientId;
    }

    public Long getFkRoleId() {
        return fkRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_role_relation.fk_role_id
     *
     * @param fkRoleId the value for client_role_relation.fk_role_id
     *
     * @mbggenerated Sat Dec 05 17:00:16 CST 2020
     */
    public void setFkRoleId(Long fkRoleId) {
        this.fkRoleId = fkRoleId;
    }

    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_role_relation.create_id
     *
     * @param createId the value for client_role_relation.create_id
     *
     * @mbggenerated Sat Dec 05 17:00:16 CST 2020
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_role_relation.create_time
     *
     * @param createTime the value for client_role_relation.create_time
     *
     * @mbggenerated Sat Dec 05 17:00:16 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_role_relation.update_time
     *
     * @param updateTime the value for client_role_relation.update_time
     *
     * @mbggenerated Sat Dec 05 17:00:16 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_role_relation.is_del
     *
     * @param isDel the value for client_role_relation.is_del
     *
     * @mbggenerated Sat Dec 05 17:00:16 CST 2020
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}