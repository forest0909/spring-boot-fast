package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysRoleDept;
import com.forest.system.entity.param.SysRoleDeptParam;

import java.util.List;

/**
 * <p>
 * 角色和部门关联表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysRoleDeptService extends TBaseService<SysRoleDept>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysRoleDept> list(SysRoleDeptParam param);
}
