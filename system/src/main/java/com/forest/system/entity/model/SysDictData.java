package com.forest.system.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.forest.core.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 字典数据表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_dict_data")
@ApiModel(value = "字典数据表对象")
public class SysDictData extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字典编码
     **/   
    @ApiModelProperty(value = "字典编码")
    @TableField("dict_code")
    private String dictCode;

    /**
     * 字典排序
     **/   
    @ApiModelProperty(value = "字典排序")
    @TableField("dict_sort")
    private Integer dictSort;

    /**
     * 字典标签
     **/   
    @ApiModelProperty(value = "字典标签")
    @TableField("dict_label")
    private String dictLabel;

    /**
     * 字典键值
     **/   
    @ApiModelProperty(value = "字典键值")
    @TableField("dict_value")
    private String dictValue;

    /**
     * 字典类型
     **/   
    @ApiModelProperty(value = "字典类型")
    @TableField("dict_type")
    private String dictType;

    /**
     * 样式属性（其他样式扩展）
     **/   
    @ApiModelProperty(value = "样式属性（其他样式扩展）")
    @TableField("css_class")
    private String cssClass;

    /**
     * 表格回显样式
     **/   
    @ApiModelProperty(value = "表格回显样式")
    @TableField("list_class")
    private String listClass;

    /**
     * 是否默认（Y是 N否）
     **/   
    @ApiModelProperty(value = "是否默认（Y是 N否）")
    @TableField("is_default")
    private String isDefault;

    /**
     * 状态（0正常 1停用）
     **/   
    @ApiModelProperty(value = "状态（0正常 1停用）")
    @TableField("status")
    private String status;

    /**
     * 备注
     **/   
    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}