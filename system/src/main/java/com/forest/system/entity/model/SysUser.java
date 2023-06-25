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
 * 用户表
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
@ApiModel(value = "用户表对象")
public class SysUser extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录账号
     **/   
    @ApiModelProperty(value = "登录账号")
    @TableField("user_name")
    private String userName;

    /**
     * 真实姓名
     **/   
    @ApiModelProperty(value = "真实姓名")
    @TableField("real_name")
    private String realName;

    /**
     * 密码
     **/   
    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    /**
     * md5密码盐
     **/   
    @ApiModelProperty(value = "md5密码盐")
    @TableField("salt")
    private String salt;

    /**
     * 头像
     **/   
    @ApiModelProperty(value = "头像")
    @TableField("avatar")
    private String avatar;

    /**
     * 性别(0-默认未知,1-男,2-女)
     **/   
    @ApiModelProperty(value = "性别(0-默认未知,1-男,2-女)")
    @TableField("sex")
    private Boolean sex;

    /**
     * 电子邮件
     **/   
    @ApiModelProperty(value = "电子邮件")
    @TableField("email")
    private String email;

    /**
     * 电话
     **/   
    @ApiModelProperty(value = "电话")
    @TableField("phone")
    private String phone;

    /**
     * 部门id
     **/   
    @ApiModelProperty(value = "部门id")
    @TableField("dept_id")
    private Long deptId;

    /**
     * 帐号状态（0正常 1停用）
     **/   
    @ApiModelProperty(value = "帐号状态（0正常 1停用）")
    @TableField("status")
    private String status;

    /**
     * 是否是管理员（0否  1是）
     **/   
    @ApiModelProperty(value = "是否是管理员（0否  1是）")
    @TableField("admin_flag")
    private String adminFlag;

    /**
     * 最后登录IP
     **/   
    @ApiModelProperty(value = "最后登录IP")
    @TableField("login_ip")
    private String loginIp;

    /**
     * 最后登录时间
     **/   
    @ApiModelProperty(value = "最后登录时间")
    @TableField("login_date")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginDate;

    /**
     * 删除标志（0代表存在 2代表删除）
     **/   
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    @TableField("del_flag")
    private String delFlag;

    /**
     * 备注
     **/   
    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}