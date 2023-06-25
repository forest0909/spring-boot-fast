package com.forest.system.entity.param;

import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：岗位信息表Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysPostParam extends PageParam{

        /**
        * 岗位编码
        **/   
        @ApiModelProperty(value = "岗位编码")
        private String postCode;
        /**
        * 岗位名称
        **/   
        @ApiModelProperty(value = "岗位名称")
        private String postName;
        /**
        * 显示顺序
        **/   
        @ApiModelProperty(value = "显示顺序")
        private Integer postSort;
        /**
        * 状态（0正常 1停用）
        **/   
        @ApiModelProperty(value = "状态（0正常 1停用）")
        private String status;
        /**
        * 备注
        **/   
        @ApiModelProperty(value = "备注")
        private String remark;
        /**
        * 删除标志（0代表存在 2代表删除）
        **/   
        @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
        private String delFlag;



}