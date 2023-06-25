package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysRoleMenu;
import com.forest.system.entity.param.SysRoleMenuParam;
import com.forest.system.mapper.SysRoleMenuMapper;

import java.util.List;

/**
 * <p>
 * 角色和菜单关联表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysRoleMenuRepository extends TBaseRepository<SysRoleMenu>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysRoleMenu> list(SysRoleMenuParam param);

    /**
    * 获取mapper
    */
    SysRoleMenuMapper getMapper();

}
