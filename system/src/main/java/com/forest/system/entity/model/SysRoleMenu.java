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
 * 角色和菜单关联表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role_menu")
@ApiModel(value = "角色和菜单关联表对象")
public class SysRoleMenu extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     **/   
    @ApiModelProperty(value = "角色ID")
    @TableField("role_id")
    private Long roleId;

    /**
     * 菜单ID
     **/   
    @ApiModelProperty(value = "菜单ID")
    @TableField("menu_id")
    private Long menuId;


}