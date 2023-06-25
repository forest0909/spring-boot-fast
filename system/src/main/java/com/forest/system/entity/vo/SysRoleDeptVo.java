package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：角色和部门关联表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysRoleDeptVo {

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
        * 部门ID
        **/   
        @ApiModelProperty(value = "部门ID")
        private Long deptId;
        /**
        * 创建者
        **/   
        @ApiModelProperty(value = "创建者")
        private String createBy;




}