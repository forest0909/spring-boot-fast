package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysMenu;
import com.forest.system.entity.param.SysMenuParam;

import java.util.List;

/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysMenuService extends TBaseService<SysMenu>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysMenu> list(SysMenuParam param);
}
