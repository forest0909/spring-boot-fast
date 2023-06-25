package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysUser;
import com.forest.system.entity.param.SysUserParam;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysUserService extends TBaseService<SysUser>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysUser> list(SysUserParam param);
}
