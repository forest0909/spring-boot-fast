package com.forest.system.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* 描述：角色信息表vo
* @author zzl
* @date 2023-06-25
*/
@Data
public class SysRoleVo {

        /**
        * 角色ID
        **/   
        @ApiModelProperty(value = "角色ID")
        private Long id;
        /**
        * 角色名称
        **/   
        @ApiModelProperty(value = "角色名称")
        private String roleName;
        /**
        * 角色权限字符串
        **/   
        @ApiModelProperty(value = "角色权限字符串")
        private String roleKey;
        /**
        * 显示顺序
        **/   
        @ApiModelProperty(value = "显示顺序")
        private Integer roleSort;
        /**
        * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
        **/   
        @ApiModelProperty(value = "数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）")
        private String dataScope;
        /**
        * 菜单树选择项是否关联显示
        **/   
        @ApiModelProperty(value = "菜单树选择项是否关联显示")
        private Boolean menuCheckStrictly;
        /**
        * 部门树选择项是否关联显示
        **/   
        @ApiModelProperty(value = "部门树选择项是否关联显示")
        private Boolean deptCheckStrictly;
        /**
        * 角色状态（0正常 1停用）
        **/   
        @ApiModelProperty(value = "角色状态（0正常 1停用）")
        private String status;
        /**
        * 删除标志（0代表存在 2代表删除）
        **/   
        @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
        private String delFlag;
        /**
        * 备注
        **/   
        @ApiModelProperty(value = "备注")
        private String remark;
        /**
        * 创建人
        **/   
        @ApiModelProperty(value = "创建人")
        private String createBy;




}