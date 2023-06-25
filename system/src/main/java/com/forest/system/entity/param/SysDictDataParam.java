package com.forest.system.entity.param;

import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：字典数据表Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysDictDataParam extends PageParam{

        /**
        * 字典编码
        **/   
        @ApiModelProperty(value = "字典编码")
        private String dictCode;
        /**
        * 字典排序
        **/   
        @ApiModelProperty(value = "字典排序")
        private Integer dictSort;
        /**
        * 字典标签
        **/   
        @ApiModelProperty(value = "字典标签")
        private String dictLabel;
        /**
        * 字典键值
        **/   
        @ApiModelProperty(value = "字典键值")
        private String dictValue;
        /**
        * 字典类型
        **/   
        @ApiModelProperty(value = "字典类型")
        private String dictType;
        /**
        * 样式属性（其他样式扩展）
        **/   
        @ApiModelProperty(value = "样式属性（其他样式扩展）")
        private String cssClass;
        /**
        * 表格回显样式
        **/   
        @ApiModelProperty(value = "表格回显样式")
        private String listClass;
        /**
        * 是否默认（Y是 N否）
        **/   
        @ApiModelProperty(value = "是否默认（Y是 N否）")
        private String isDefault;
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