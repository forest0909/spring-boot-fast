package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysUserRole;
import com.forest.system.entity.param.SysUserRoleParam;

import java.util.List;

/**
 * <p>
 * 用户和角色关联表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysUserRoleService extends TBaseService<SysUserRole>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysUserRole> list(SysUserRoleParam param);
}
