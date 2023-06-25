package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysUserRole;
import com.forest.system.entity.param.SysUserRoleParam;
import com.forest.system.mapper.SysUserRoleMapper;
import com.forest.system.repository.SysUserRoleRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户和角色关联表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysUserRoleRepositoryImpl extends TBaseRepositoryImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleRepository {
    @Resource
    SysUserRoleMapper sysUserRoleMapper;

    /**
    * 获取mapper
    */
    public SysUserRoleMapper getMapper(){
        return sysUserRoleMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysUserRole> list(SysUserRoleParam param) {
        return sysUserRoleMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysUserRole> getWrapper(SysUserRoleParam param) {
    LambdaQueryWrapper<SysUserRole> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 用户ID
            if (ObjectUtil.isNotNull(param.getUserId())) {
            wrapper.eq(SysUserRole::getUserId, param.getUserId());
            }

            // 角色ID
            if (ObjectUtil.isNotNull(param.getRoleId())) {
            wrapper.eq(SysUserRole::getRoleId, param.getRoleId());
            }
            wrapper.orderByDesc(SysUserRole::getCreateTime);
        }
        return wrapper;
    }


}
