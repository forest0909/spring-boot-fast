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
 * 通知公告表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_notice")
@ApiModel(value = "通知公告表对象")
public class SysNotice extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公告标题
     **/   
    @ApiModelProperty(value = "公告标题")
    @TableField("notice_title")
    private String noticeTitle;

    /**
     * 公告类型（1通知 2公告）
     **/   
    @ApiModelProperty(value = "公告类型（1通知 2公告）")
    @TableField("notice_type")
    private String noticeType;

    /**
     * 公告内容
     **/   
    @ApiModelProperty(value = "公告内容")
    @TableField("notice_content")
    private String noticeContent;

    /**
     * 公告状态（0正常 1关闭）
     **/   
    @ApiModelProperty(value = "公告状态（0正常 1关闭）")
    @TableField("status")
    private String status;

    /**
     * 备注
     **/   
    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}