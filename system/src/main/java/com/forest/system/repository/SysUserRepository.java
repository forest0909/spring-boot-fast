package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysUser;
import com.forest.system.entity.param.SysUserParam;
import com.forest.system.mapper.SysUserMapper;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-21
 */
public interface SysUserRepository extends TBaseRepository<SysUser>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysUser> list(SysUserParam param);

    /**
    * 获取mapper
    */
    SysUserMapper getMapper();

}
