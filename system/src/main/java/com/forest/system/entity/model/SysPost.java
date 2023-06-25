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
 * 岗位信息表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_post")
@ApiModel(value = "岗位信息表对象")
public class SysPost extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位编码
     **/   
    @ApiModelProperty(value = "岗位编码")
    @TableField("post_code")
    private String postCode;

    /**
     * 岗位名称
     **/   
    @ApiModelProperty(value = "岗位名称")
    @TableField("post_name")
    private String postName;

    /**
     * 显示顺序
     **/   
    @ApiModelProperty(value = "显示顺序")
    @TableField("post_sort")
    private Integer postSort;

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

    /**
     * 删除标志（0代表存在 2代表删除）
     **/   
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    @TableField("del_flag")
    private String delFlag;


}