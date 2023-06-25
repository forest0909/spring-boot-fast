package com.forest.system.entity.param;

import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：字典类型表Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysDictParam extends PageParam{

        /**
        * 字典名称
        **/   
        @ApiModelProperty(value = "字典名称")
        private String dictName;
        /**
        * 字典类型
        **/   
        @ApiModelProperty(value = "字典类型")
        private String dictType;
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



}