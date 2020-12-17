package com.shop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品类别
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("classification")
public class ClassificationDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品类别id
     */
    private Long pkClassificationId;

    /**
     * 编号
     */
    private String classificationNo;

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
