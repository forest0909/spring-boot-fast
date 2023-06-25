package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysRoleDept;
import com.forest.system.entity.param.SysRoleDeptParam;
import com.forest.system.repository.SysRoleDeptRepository;
import com.forest.system.service.ISysRoleDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 角色和部门关联表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysRoleDeptServiceImpl extends TBaseServiceImpl<SysRoleDeptRepository,SysRoleDept> implements ISysRoleDeptService {
    @Resource
    SysRoleDeptRepository sysRoleDeptRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysRoleDept> list(SysRoleDeptParam param) {
        return sysRoleDeptRepository.list(param);
    }
}
