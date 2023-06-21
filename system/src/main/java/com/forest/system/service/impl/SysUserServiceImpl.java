package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysUser;
import com.forest.system.entity.param.SysUserParam;
import com.forest.system.repository.SysUserRepository;
import com.forest.system.service.ISysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-21
 */
@Service
public class SysUserServiceImpl extends TBaseServiceImpl<SysUserRepository,SysUser> implements ISysUserService {
    @Resource
    SysUserRepository sysUserRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysUser> list(SysUserParam param) {
        return sysUserRepository.list(param);
    }
}
