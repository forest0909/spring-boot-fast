package com.forest.system.entity.param;

import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：用户与岗位关联表Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysUserPostParam extends PageParam{

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



}