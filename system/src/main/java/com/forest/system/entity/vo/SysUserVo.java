package com.forest.system.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
* 描述：用户表vo
* @author zzl
* @date 2023-06-21
*/
@Data
public class SysUserVo {

        /**
        * 主键id
        **/   
        @ApiModelProperty(value = "主键id")
        private Long id;
        /**
        * 登录账号
        **/   
        @ApiModelProperty(value = "登录账号")
        private String userName;
        /**
        * 真实姓名
        **/   
        @ApiModelProperty(value = "真实姓名")
        private String realName;
        /**
        * 密码
        **/   
        @ApiModelProperty(value = "密码")
        private String password;
        /**
        * md5密码盐
        **/   
        @ApiModelProperty(value = "md5密码盐")
        private String salt;
        /**
        * 头像
        **/   
        @ApiModelProperty(value = "头像")
        private String avatar;
        /**
        * 性别(0-默认未知,1-男,2-女)
        **/   
        @ApiModelProperty(value = "性别(0-默认未知,1-男,2-女)")
        private Boolean sex;
        /**
        * 电子邮件
        **/   
        @ApiModelProperty(value = "电子邮件")
        private String email;
        /**
        * 电话
        **/   
        @ApiModelProperty(value = "电话")
        private String phone;
        /**
        * 部门id
        **/   
        @ApiModelProperty(value = "部门id")
        private Long deptId;
        /**
        * 帐号状态（0正常 1停用）
        **/   
        @ApiModelProperty(value = "帐号状态（0正常 1停用）")
        private String status;
        /**
        * 是否是管理员（0否  1是）
        **/   
        @ApiModelProperty(value = "是否是管理员（0否  1是）")
        private String adminFlag;
        /**
        * 最后登录IP
        **/   
        @ApiModelProperty(value = "最后登录IP")
        private String loginIp;
        /**
        * 最后登录时间
        **/   
        @ApiModelProperty(value = "最后登录时间")
        @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date loginDate;
        /**
        * 创建人
        **/   
        @ApiModelProperty(value = "创建人")
        private String createUser;
        /**
        * 备注
        **/   
        @ApiModelProperty(value = "备注")
        private String remark;




}