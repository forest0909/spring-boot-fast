package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysRoleMenu;
import com.forest.system.entity.param.SysRoleMenuParam;
import com.forest.system.repository.SysRoleMenuRepository;
import com.forest.system.service.ISysRoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysRoleMenuServiceImpl extends TBaseServiceImpl<SysRoleMenuRepository,SysRoleMenu> implements ISysRoleMenuService {
    @Resource
    SysRoleMenuRepository sysRoleMenuRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysRoleMenu> list(SysRoleMenuParam param) {
        return sysRoleMenuRepository.list(param);
    }
}
