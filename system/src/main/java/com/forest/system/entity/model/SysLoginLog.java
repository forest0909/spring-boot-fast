package com.forest.system.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.forest.core.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统访问记录
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_login_log")
@ApiModel(value = "系统访问记录对象")
public class SysLoginLog extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账号
     **/   
    @ApiModelProperty(value = "用户账号")
    @TableField("user_name")
    private String userName;

    /**
     * 登录IP地址
     **/   
    @ApiModelProperty(value = "登录IP地址")
    @TableField("ipaddr")
    private String ipaddr;

    /**
     * 登录地点
     **/   
    @ApiModelProperty(value = "登录地点")
    @TableField("login_location")
    private String loginLocation;

    /**
     * 浏览器类型
     **/   
    @ApiModelProperty(value = "浏览器类型")
    @TableField("browser")
    private String browser;

    /**
     * 操作系统
     **/   
    @ApiModelProperty(value = "操作系统")
    @TableField("os")
    private String os;

    /**
     * 登录状态（0成功 1失败）
     **/   
    @ApiModelProperty(value = "登录状态（0成功 1失败）")
    @TableField("status")
    private String status;

    /**
     * 提示消息
     **/   
    @ApiModelProperty(value = "提示消息")
    @TableField("msg")
    private String msg;

    /**
     * 访问时间
     **/   
    @ApiModelProperty(value = "访问时间")
    @TableField("login_time")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginTime;


}