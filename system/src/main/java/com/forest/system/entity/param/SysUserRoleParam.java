package com.forest.system.entity.param;

import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：用户和角色关联表Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysUserRoleParam extends PageParam{

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



}