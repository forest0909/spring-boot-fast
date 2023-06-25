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
 * 部门表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_dept")
@ApiModel(value = "部门表对象")
public class SysDept extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 父部门id
     **/   
    @ApiModelProperty(value = "父部门id")
    @TableField("parent_id")
    private Long parentId;

    /**
     * 祖级列表
     **/   
    @ApiModelProperty(value = "祖级列表")
    @TableField("ancestors")
    private String ancestors;

    /**
     * 部门名称
     **/   
    @ApiModelProperty(value = "部门名称")
    @TableField("dept_name")
    private String deptName;

    /**
     * 显示顺序
     **/   
    @ApiModelProperty(value = "显示顺序")
    @TableField("order_num")
    private Integer orderNum;

    /**
     * 负责人
     **/   
    @ApiModelProperty(value = "负责人")
    @TableField("leader")
    private String leader;

    /**
     * 联系电话
     **/   
    @ApiModelProperty(value = "联系电话")
    @TableField("phone")
    private String phone;

    /**
     * 邮箱
     **/   
    @ApiModelProperty(value = "邮箱")
    @TableField("email")
    private String email;

    /**
     * 部门状态（0正常 1停用）
     **/   
    @ApiModelProperty(value = "部门状态（0正常 1停用）")
    @TableField("status")
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     **/   
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    @TableField("del_flag")
    private String delFlag;


}