package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：菜单权限表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysMenuVo {

        /**
        * 菜单ID
        **/   
        @ApiModelProperty(value = "菜单ID")
        private Long id;
        /**
        * 菜单名称
        **/   
        @ApiModelProperty(value = "菜单名称")
        private String menuName;
        /**
        * 父菜单ID
        **/   
        @ApiModelProperty(value = "父菜单ID")
        private Long parentId;
        /**
        * 显示顺序
        **/   
        @ApiModelProperty(value = "显示顺序")
        private Integer orderNum;
        /**
        * 路由地址
        **/   
        @ApiModelProperty(value = "路由地址")
        private String path;
        /**
        * 组件路径
        **/   
        @ApiModelProperty(value = "组件路径")
        private String component;
        /**
        * 路由参数
        **/   
        @ApiModelProperty(value = "路由参数")
        private String query;
        /**
        * 是否为外链（0是 1否）
        **/   
        @ApiModelProperty(value = "是否为外链（0是 1否）")
        private Integer isFrame;
        /**
        * 是否缓存（0缓存 1不缓存）
        **/   
        @ApiModelProperty(value = "是否缓存（0缓存 1不缓存）")
        private Integer isCache;
        /**
        * 菜单类型（M目录 C菜单 F按钮）
        **/   
        @ApiModelProperty(value = "菜单类型（M目录 C菜单 F按钮）")
        private String menuType;
        /**
        * 菜单状态（0显示 1隐藏）
        **/   
        @ApiModelProperty(value = "菜单状态（0显示 1隐藏）")
        private String visible;
        /**
        * 菜单状态（0正常 1停用）
        **/   
        @ApiModelProperty(value = "菜单状态（0正常 1停用）")
        private String status;
        /**
        * 权限标识
        **/   
        @ApiModelProperty(value = "权限标识")
        private String perms;
        /**
        * 菜单图标
        **/   
        @ApiModelProperty(value = "菜单图标")
        private String icon;
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