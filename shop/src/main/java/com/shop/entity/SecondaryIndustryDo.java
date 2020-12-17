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
 * 次级行业表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("secondary_industry")
public class SecondaryIndustryDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 次级行业表id
     */
    @TableId(value = "pk_secondary_industry_id", type = IdType.AUTO)
    private Long pkSecondaryIndustryId;

    /**
     * 编号
     */
    private String secondaryIndustryNo;

    /**
     * 名称
     */
    private String name;

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
