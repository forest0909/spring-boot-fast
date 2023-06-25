package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：用户和角色关联表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysUserRoleVo {

        /**
        * ID
        **/   
        @ApiModelProperty(value = "ID")
        private Long id;
        /**
        * 用户ID
        **/   
        @ApiModelProperty(value = "用户ID")
        private Long userId;
        /**
        * 角色ID
        **/   
        @ApiModelProperty(value = "角色ID")
        private Long roleId;
        /**
        * 创建者
        **/   
        @ApiModelProperty(value = "创建者")
        private String createBy;




}