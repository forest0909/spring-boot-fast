package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：用户与岗位关联表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysUserPostVo {

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
        * 岗位ID
        **/   
        @ApiModelProperty(value = "岗位ID")
        private Long postId;
        /**
        * 创建者
        **/   
        @ApiModelProperty(value = "创建者")
        private String createBy;




}