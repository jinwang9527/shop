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
 * 快递表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("express")
public class ExpressDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 快递表id
     */
    @TableId(value = "pk_express_id", type = IdType.AUTO)
    private Long pkExpressId;

    /**
     * 快递编号
     */
    private String expressNo;

    /**
     * 快递名称
     */
    private String expressName;

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
