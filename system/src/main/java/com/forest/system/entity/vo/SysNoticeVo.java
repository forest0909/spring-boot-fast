package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：通知公告表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysNoticeVo {

        /**
        * 公告ID
        **/   
        @ApiModelProperty(value = "公告ID")
        private Long id;
        /**
        * 公告标题
        **/   
        @ApiModelProperty(value = "公告标题")
        private String noticeTitle;
        /**
        * 公告类型（1通知 2公告）
        **/   
        @ApiModelProperty(value = "公告类型（1通知 2公告）")
        private String noticeType;
        /**
        * 公告内容
        **/   
        @ApiModelProperty(value = "公告内容")
        private String noticeContent;
        /**
        * 公告状态（0正常 1关闭）
        **/   
        @ApiModelProperty(value = "公告状态（0正常 1关闭）")
        private String status;
        /**
        * 创建者
        **/   
        @ApiModelProperty(value = "创建者")
        private String createBy;
        /**
        * 备注
        **/   
        @ApiModelProperty(value = "备注")
        private String remark;




}