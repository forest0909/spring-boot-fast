package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysRoleDept;
import com.forest.system.entity.param.SysRoleDeptParam;
import com.forest.system.mapper.SysRoleDeptMapper;
import com.forest.system.repository.SysRoleDeptRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public class SysRoleDeptRepositoryImpl extends TBaseRepositoryImpl<SysRoleDeptMapper, SysRoleDept> implements SysRoleDeptRepository {
    @Resource
    SysRoleDeptMapper sysRoleDeptMapper;

    /**
    * 获取mapper
    */
    public SysRoleDeptMapper getMapper(){
        return sysRoleDeptMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysRoleDept> list(SysRoleDeptParam param) {
        return sysRoleDeptMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysRoleDept> getWrapper(SysRoleDeptParam param) {
    LambdaQueryWrapper<SysRoleDept> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 角色ID
            if (ObjectUtil.isNotNull(param.getRoleId())) {
            wrapper.eq(SysRoleDept::getRoleId, param.getRoleId());
            }

            // 部门ID
            if (ObjectUtil.isNotNull(param.getDeptId())) {
            wrapper.eq(SysRoleDept::getDeptId, param.getDeptId());
            }
            wrapper.orderByDesc(SysRoleDept::getCreateTime);
        }
        return wrapper;
    }


}
