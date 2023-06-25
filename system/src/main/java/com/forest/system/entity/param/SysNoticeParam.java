package com.forest.system.entity.param;

import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：通知公告表Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysNoticeParam extends PageParam{

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
        * 备注
        **/   
        @ApiModelProperty(value = "备注")
        private String remark;



}