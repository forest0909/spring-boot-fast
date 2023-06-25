package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：部门表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysDeptVo {

        /**
        * 部门id
        **/   
        @ApiModelProperty(value = "部门id")
        private Long id;
        /**
        * 父部门id
        **/   
        @ApiModelProperty(value = "父部门id")
        private Long parentId;
        /**
        * 祖级列表
        **/   
        @ApiModelProperty(value = "祖级列表")
        private String ancestors;
        /**
        * 部门名称
        **/   
        @ApiModelProperty(value = "部门名称")
        private String deptName;
        /**
        * 显示顺序
        **/   
        @ApiModelProperty(value = "显示顺序")
        private Integer orderNum;
        /**
        * 负责人
        **/   
        @ApiModelProperty(value = "负责人")
        private String leader;
        /**
        * 联系电话
        **/   
        @ApiModelProperty(value = "联系电话")
        private String phone;
        /**
        * 邮箱
        **/   
        @ApiModelProperty(value = "邮箱")
        private String email;
        /**
        * 部门状态（0正常 1停用）
        **/   
        @ApiModelProperty(value = "部门状态（0正常 1停用）")
        private String status;
        /**
        * 删除标志（0代表存在 2代表删除）
        **/   
        @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
        private String delFlag;
        /**
        * 创建者
        **/   
        @ApiModelProperty(value = "创建者")
        private String createBy;




}