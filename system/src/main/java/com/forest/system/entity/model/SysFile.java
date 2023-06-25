package com.forest.system.entity.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.forest.core.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 上传文件
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_file")
@ApiModel(value = "上传文件对象")
public class SysFile extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件名
     **/   
    @ApiModelProperty(value = "文件名")
    @TableField("file_name")
    private String fileName;

    /**
     * 文件路径
     **/   
    @ApiModelProperty(value = "文件路径")
    @TableField("file_path")
    private String filePath;

    /**
     * 文件类型
     **/   
    @ApiModelProperty(value = "文件类型")
    @TableField("file_type")
    private String fileType;

    /**
     * 文件大小
     **/   
    @ApiModelProperty(value = "文件大小")
    @TableField("file_size")
    private String fileSize;

    /**
     * 上传来源类型 1:红黑榜 2:抄告单 3:督办单 4:回复函
     **/   
    @ApiModelProperty(value = "上传来源类型 1:红黑榜 2:抄告单 3:督办单 4:回复函")
    @TableField("file_source_type")
    private String fileSourceType;


}