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
 * 系统参数表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("system_parameter")
public class SystemParameterDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 系统枚举表id
     */
    @TableId(value = "pk_system_enum_id", type = IdType.AUTO)
    private Long pkSystemEnumId;

    /**
     * 枚举编号
     */
    private Integer systemEnumNo;

    /**
     * 枚举常量
     */
    private Long constant;

    /**
     * 枚举key
     */
    private String key;

    /**
     * 枚举值
     */
    private String value;

    /**
     * 描述
     */
    private String desc;

    /**
     * 排序
     */
    private Long sort;

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
