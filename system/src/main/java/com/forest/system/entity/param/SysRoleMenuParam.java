package com.forest.system.entity.param;

import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：角色和菜单关联表Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysRoleMenuParam extends PageParam{

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



}