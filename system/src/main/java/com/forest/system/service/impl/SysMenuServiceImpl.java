package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysMenu;
import com.forest.system.entity.param.SysMenuParam;
import com.forest.system.repository.SysMenuRepository;
import com.forest.system.service.ISysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysMenuServiceImpl extends TBaseServiceImpl<SysMenuRepository,SysMenu> implements ISysMenuService {
    @Resource
    SysMenuRepository sysMenuRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysMenu> list(SysMenuParam param) {
        return sysMenuRepository.list(param);
    }
}
