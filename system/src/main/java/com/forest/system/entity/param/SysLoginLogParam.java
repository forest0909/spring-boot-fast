package com.forest.system.entity.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
* 描述：系统访问记录Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysLoginLogParam extends PageParam{

        /**
        * 用户账号
        **/   
        @ApiModelProperty(value = "用户账号")
        private String userName;
        /**
        * 登录IP地址
        **/   
        @ApiModelProperty(value = "登录IP地址")
        private String ipaddr;
        /**
        * 登录地点
        **/   
        @ApiModelProperty(value = "登录地点")
        private String loginLocation;
        /**
        * 浏览器类型
        **/   
        @ApiModelProperty(value = "浏览器类型")
        private String browser;
        /**
        * 操作系统
        **/   
        @ApiModelProperty(value = "操作系统")
        private String os;
        /**
        * 登录状态（0成功 1失败）
        **/   
        @ApiModelProperty(value = "登录状态（0成功 1失败）")
        private String status;
        /**
        * 提示消息
        **/   
        @ApiModelProperty(value = "提示消息")
        private String msg;
        /**
        * 访问时间
        **/   
        @ApiModelProperty(value = "访问时间")
        @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date loginTime;

        @ApiModelProperty(value = "访问时间 开始时间")
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date loginTimeStartTime;

        @ApiModelProperty(value = "访问时间 结束时间")
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date loginTimeEndTime;



}