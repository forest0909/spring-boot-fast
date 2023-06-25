package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysRole;
import com.forest.system.entity.param.SysRoleParam;
import com.forest.system.mapper.SysRoleMapper;

import java.util.List;

/**
 * <p>
 * 角色信息表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysRoleRepository extends TBaseRepository<SysRole>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysRole> list(SysRoleParam param);

    /**
    * 获取mapper
    */
    SysRoleMapper getMapper();

}
