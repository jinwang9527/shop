package com.shop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 客户表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("client")
public class ClientDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户id
     */
    @TableId(value = "pk_client_id", type = IdType.AUTO)
    private Long pkClientId;

    /**
     * 客户编号
     */
    @TableField("client_No")
    private String clientNo;

    /**
     * 客户密码
     */
    private String password;

    /**
     * 账号
     */
    private String account;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 客户电话
     */
    private String phone;

    /**
     * 头像
     */
    private String headPortrait;

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
