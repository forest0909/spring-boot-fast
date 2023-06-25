package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysRole;
import com.forest.system.entity.param.SysRoleParam;

import java.util.List;

/**
 * <p>
 * 角色信息表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysRoleService extends TBaseService<SysRole>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysRole> list(SysRoleParam param);
}
