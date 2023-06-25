package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysRoleMenu;
import com.forest.system.entity.param.SysRoleMenuParam;

import java.util.List;

/**
 * <p>
 * 角色和菜单关联表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysRoleMenuService extends TBaseService<SysRoleMenu>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysRoleMenu> list(SysRoleMenuParam param);
}
