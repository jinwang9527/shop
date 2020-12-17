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
 * 
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("client_role_relation")
public class ClientRoleRelationDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户角色关联id
     */
    @TableId(value = "pk_client_role_relation_id", type = IdType.AUTO)
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


}
