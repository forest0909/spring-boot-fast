package com.forest.system.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
* 描述：操作日志记录vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysOperLogVo {

        /**
        * 日志主键
        **/   
        @ApiModelProperty(value = "日志主键")
        private Long id;
        /**
        * 模块标题
        **/   
        @ApiModelProperty(value = "模块标题")
        private String title;
        /**
        * 业务类型（0其它 1新增 2修改 3删除）
        **/   
        @ApiModelProperty(value = "业务类型（0其它 1新增 2修改 3删除）")
        private Integer businessType;
        /**
        * 方法名称
        **/   
        @ApiModelProperty(value = "方法名称")
        private String method;
        /**
        * 请求方式
        **/   
        @ApiModelProperty(value = "请求方式")
        private String requestMethod;
        /**
        * 操作类别（0其它 1后台用户 2手机端用户）
        **/   
        @ApiModelProperty(value = "操作类别（0其它 1后台用户 2手机端用户）")
        private Integer operatorType;
        /**
        * 操作人员
        **/   
        @ApiModelProperty(value = "操作人员")
        private String operName;
        /**
        * 部门名称
        **/   
        @ApiModelProperty(value = "部门名称")
        private String deptName;
        /**
        * 请求URL
        **/   
        @ApiModelProperty(value = "请求URL")
        private String operUrl;
        /**
        * 主机地址
        **/   
        @ApiModelProperty(value = "主机地址")
        private String operIp;
        /**
        * 操作地点
        **/   
        @ApiModelProperty(value = "操作地点")
        private String operLocation;
        /**
        * 请求参数
        **/   
        @ApiModelProperty(value = "请求参数")
        private String operParam;
        /**
        * 返回参数
        **/   
        @ApiModelProperty(value = "返回参数")
        private String jsonResult;
        /**
        * 操作状态（0正常 1异常）
        **/   
        @ApiModelProperty(value = "操作状态（0正常 1异常）")
        private Integer status;
        /**
        * 错误消息
        **/   
        @ApiModelProperty(value = "错误消息")
        private String errorMsg;
        /**
        * 操作时间
        **/   
        @ApiModelProperty(value = "操作时间")
        @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date operTime;
        /**
        * 消耗时间
        **/   
        @ApiModelProperty(value = "消耗时间")
        private Long costTime;




}