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
 * 角色信息表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role")
@ApiModel(value = "角色信息表对象")
public class SysRole extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名称
     **/   
    @ApiModelProperty(value = "角色名称")
    @TableField("role_name")
    private String roleName;

    /**
     * 角色权限字符串
     **/   
    @ApiModelProperty(value = "角色权限字符串")
    @TableField("role_key")
    private String roleKey;

    /**
     * 显示顺序
     **/   
    @ApiModelProperty(value = "显示顺序")
    @TableField("role_sort")
    private Integer roleSort;

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
     **/   
    @ApiModelProperty(value = "数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）")
    @TableField("data_scope")
    private String dataScope;

    /**
     * 菜单树选择项是否关联显示
     **/   
    @ApiModelProperty(value = "菜单树选择项是否关联显示")
    @TableField("menu_check_strictly")
    private Boolean menuCheckStrictly;

    /**
     * 部门树选择项是否关联显示
     **/   
    @ApiModelProperty(value = "部门树选择项是否关联显示")
    @TableField("dept_check_strictly")
    private Boolean deptCheckStrictly;

    /**
     * 角色状态（0正常 1停用）
     **/   
    @ApiModelProperty(value = "角色状态（0正常 1停用）")
    @TableField("status")
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     **/   
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    @TableField("del_flag")
    private String delFlag;

    /**
     * 备注
     **/   
    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}