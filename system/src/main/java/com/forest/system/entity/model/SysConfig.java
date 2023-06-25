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
 * 参数配置表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_config")
@ApiModel(value = "参数配置表对象")
public class SysConfig extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数名称
     **/   
    @ApiModelProperty(value = "参数名称")
    @TableField("config_name")
    private String configName;

    /**
     * 参数键名
     **/   
    @ApiModelProperty(value = "参数键名")
    @TableField("config_key")
    private String configKey;

    /**
     * 参数键值
     **/   
    @ApiModelProperty(value = "参数键值")
    @TableField("config_value")
    private String configValue;

    /**
     * 系统内置（Y是 N否）
     **/   
    @ApiModelProperty(value = "系统内置（Y是 N否）")
    @TableField("config_type")
    private String configType;

    /**
     * 备注
     **/   
    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}