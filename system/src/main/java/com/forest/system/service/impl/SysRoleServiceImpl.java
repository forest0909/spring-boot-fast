package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysRole;
import com.forest.system.entity.param.SysRoleParam;
import com.forest.system.repository.SysRoleRepository;
import com.forest.system.service.ISysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysRoleServiceImpl extends TBaseServiceImpl<SysRoleRepository,SysRole> implements ISysRoleService {
    @Resource
    SysRoleRepository sysRoleRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysRole> list(SysRoleParam param) {
        return sysRoleRepository.list(param);
    }
}
