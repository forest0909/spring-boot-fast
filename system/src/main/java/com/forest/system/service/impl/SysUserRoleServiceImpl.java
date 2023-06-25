package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysUserRole;
import com.forest.system.entity.param.SysUserRoleParam;
import com.forest.system.repository.SysUserRoleRepository;
import com.forest.system.service.ISysUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户和角色关联表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysUserRoleServiceImpl extends TBaseServiceImpl<SysUserRoleRepository,SysUserRole> implements ISysUserRoleService {
    @Resource
    SysUserRoleRepository sysUserRoleRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysUserRole> list(SysUserRoleParam param) {
        return sysUserRoleRepository.list(param);
    }
}
