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
 * 字典类型表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_dict")
@ApiModel(value = "字典类型表对象")
public class SysDict extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字典名称
     **/   
    @ApiModelProperty(value = "字典名称")
    @TableField("dict_name")
    private String dictName;

    /**
     * 字典类型
     **/   
    @ApiModelProperty(value = "字典类型")
    @TableField("dict_type")
    private String dictType;

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