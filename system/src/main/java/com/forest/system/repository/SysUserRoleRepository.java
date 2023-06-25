package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysUserRole;
import com.forest.system.entity.param.SysUserRoleParam;
import com.forest.system.mapper.SysUserRoleMapper;

import java.util.List;

/**
 * <p>
 * 用户和角色关联表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysUserRoleRepository extends TBaseRepository<SysUserRole>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysUserRole> list(SysUserRoleParam param);

    /**
    * 获取mapper
    */
    SysUserRoleMapper getMapper();

}
