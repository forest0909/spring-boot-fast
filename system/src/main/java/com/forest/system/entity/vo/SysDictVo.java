package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：字典类型表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysDictVo {

        /**
        * 字典主键
        **/   
        @ApiModelProperty(value = "字典主键")
        private Long id;
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
        * 创建者
        **/   
        @ApiModelProperty(value = "创建者")
        private String createBy;
        /**
        * 备注
        **/   
        @ApiModelProperty(value = "备注")
        private String remark;




}