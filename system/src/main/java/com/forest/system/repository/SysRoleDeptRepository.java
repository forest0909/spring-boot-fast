package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysRoleDept;
import com.forest.system.entity.param.SysRoleDeptParam;
import com.forest.system.mapper.SysRoleDeptMapper;

import java.util.List;

/**
 * <p>
 * 角色和部门关联表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysRoleDeptRepository extends TBaseRepository<SysRoleDept>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysRoleDept> list(SysRoleDeptParam param);

    /**
    * 获取mapper
    */
    SysRoleDeptMapper getMapper();

}
