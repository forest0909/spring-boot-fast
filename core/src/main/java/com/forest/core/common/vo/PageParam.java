package com.forest.core.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zzl
 * @version 1.0
 * ClassName：PageParam
 * Date：2023/6/21
 * Description：
 */
@ApiModel
@Data
public class PageParam {

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页 默认为1",  example = "1")
    private int pageNum = 1;

    /**
     * 每页显示条数，默认 10
     */
    @ApiModelProperty(value = "每页显示条数，默认 10",  example = "10")
    private int pageSize = 10;
}
