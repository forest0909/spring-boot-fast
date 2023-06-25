package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：参数配置表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysConfigVo {

        /**
        * 参数主键
        **/   
        @ApiModelProperty(value = "参数主键")
        private Long id;
        /**
        * 参数名称
        **/   
        @ApiModelProperty(value = "参数名称")
        private String configName;
        /**
        * 参数键名
        **/   
        @ApiModelProperty(value = "参数键名")
        private String configKey;
        /**
        * 参数键值
        **/   
        @ApiModelProperty(value = "参数键值")
        private String configValue;
        /**
        * 系统内置（Y是 N否）
        **/   
        @ApiModelProperty(value = "系统内置（Y是 N否）")
        private String configType;
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