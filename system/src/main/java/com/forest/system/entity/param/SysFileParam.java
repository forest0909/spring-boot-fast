package com.forest.system.entity.param;

import com.forest.core.common.vo.PageParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：上传文件Param
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysFileParam extends PageParam{

        /**
        * 文件名
        **/   
        @ApiModelProperty(value = "文件名")
        private String fileName;
        /**
        * 文件路径
        **/   
        @ApiModelProperty(value = "文件路径")
        private String filePath;
        /**
        * 文件类型
        **/   
        @ApiModelProperty(value = "文件类型")
        private String fileType;
        /**
        * 文件大小
        **/   
        @ApiModelProperty(value = "文件大小")
        private String fileSize;
        /**
        * 上传来源类型 1:红黑榜 2:抄告单 3:督办单 4:回复函
        **/   
        @ApiModelProperty(value = "上传来源类型 1:红黑榜 2:抄告单 3:督办单 4:回复函")
        private String fileSourceType;



}