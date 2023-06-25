package com.forest.system.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.forest.core.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 用户与岗位关联表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user_post")
@ApiModel(value = "用户与岗位关联表对象")
public class SysUserPost extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     **/   
    @ApiModelProperty(value = "用户ID")
    @TableField("user_id")
    private Long userId;

    /**
     * 岗位ID
     **/   
    @ApiModelProperty(value = "岗位ID")
    @TableField("post_id")
    private Long postId;


}