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
 * 操作日志记录
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_oper_log")
@ApiModel(value = "操作日志记录对象")
public class SysOperLog extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模块标题
     **/   
    @ApiModelProperty(value = "模块标题")
    @TableField("title")
    private String title;

    /**
     * 业务类型（0其它 1新增 2修改 3删除）
     **/   
    @ApiModelProperty(value = "业务类型（0其它 1新增 2修改 3删除）")
    @TableField("business_type")
    private Integer businessType;

    /**
     * 方法名称
     **/   
    @ApiModelProperty(value = "方法名称")
    @TableField("method")
    private String method;

    /**
     * 请求方式
     **/   
    @ApiModelProperty(value = "请求方式")
    @TableField("request_method")
    private String requestMethod;

    /**
     * 操作类别（0其它 1后台用户 2手机端用户）
     **/   
    @ApiModelProperty(value = "操作类别（0其它 1后台用户 2手机端用户）")
    @TableField("operator_type")
    private Integer operatorType;

    /**
     * 操作人员
     **/   
    @ApiModelProperty(value = "操作人员")
    @TableField("oper_name")
    private String operName;

    /**
     * 部门名称
     **/   
    @ApiModelProperty(value = "部门名称")
    @TableField("dept_name")
    private String deptName;

    /**
     * 请求URL
     **/   
    @ApiModelProperty(value = "请求URL")
    @TableField("oper_url")
    private String operUrl;

    /**
     * 主机地址
     **/   
    @ApiModelProperty(value = "主机地址")
    @TableField("oper_ip")
    private String operIp;

    /**
     * 操作地点
     **/   
    @ApiModelProperty(value = "操作地点")
    @TableField("oper_location")
    private String operLocation;

    /**
     * 请求参数
     **/   
    @ApiModelProperty(value = "请求参数")
    @TableField("oper_param")
    private String operParam;

    /**
     * 返回参数
     **/   
    @ApiModelProperty(value = "返回参数")
    @TableField("json_result")
    private String jsonResult;

    /**
     * 操作状态（0正常 1异常）
     **/   
    @ApiModelProperty(value = "操作状态（0正常 1异常）")
    @TableField("status")
    private Integer status;

    /**
     * 错误消息
     **/   
    @ApiModelProperty(value = "错误消息")
    @TableField("error_msg")
    private String errorMsg;

    /**
     * 操作时间
     **/   
    @ApiModelProperty(value = "操作时间")
    @TableField("oper_time")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date operTime;

    /**
     * 消耗时间
     **/   
    @ApiModelProperty(value = "消耗时间")
    @TableField("cost_time")
    private Long costTime;


}