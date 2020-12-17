package com.shop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 行业表
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("industry")
public class IndustryDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 行业表id
     */
    private Long pkIndustryId;

    /**
     * 行业编号
     */
    private String industryNo;

    /**
     * 行业名称
     */
    private String industryName;

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
