package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：角色和菜单关联表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysRoleMenuVo {

        /**
        * ID
        **/   
        @ApiModelProperty(value = "ID")
        private Long id;
        /**
        * 角色ID
        **/   
        @ApiModelProperty(value = "角色ID")
        private Long roleId;
        /**
        * 菜单ID
        **/   
        @ApiModelProperty(value = "菜单ID")
        private Long menuId;
        /**
        * 创建者
        **/   
        @ApiModelProperty(value = "创建者")
        private String createBy;




}