package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysMenu;
import com.forest.system.entity.param.SysMenuParam;
import com.forest.system.mapper.SysMenuMapper;

import java.util.List;

/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysMenuRepository extends TBaseRepository<SysMenu>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysMenu> list(SysMenuParam param);

    /**
    * 获取mapper
    */
    SysMenuMapper getMapper();

}
