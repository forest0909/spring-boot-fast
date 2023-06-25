package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysRole;
import com.forest.system.entity.param.SysRoleParam;
import com.forest.system.mapper.SysRoleMapper;
import com.forest.system.repository.SysRoleRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 角色信息表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysRoleRepositoryImpl extends TBaseRepositoryImpl<SysRoleMapper, SysRole> implements SysRoleRepository {
    @Resource
    SysRoleMapper sysRoleMapper;

    /**
    * 获取mapper
    */
    public SysRoleMapper getMapper(){
        return sysRoleMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysRole> list(SysRoleParam param) {
        return sysRoleMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysRole> getWrapper(SysRoleParam param) {
    LambdaQueryWrapper<SysRole> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 角色名称
            if (StrUtil.isNotBlank(param.getRoleName())) {
            wrapper.eq(SysRole::getRoleName, param.getRoleName());
            }

            // 角色权限字符串
            if (StrUtil.isNotBlank(param.getRoleKey())) {
            wrapper.eq(SysRole::getRoleKey, param.getRoleKey());
            }

            // 显示顺序
            if (ObjectUtil.isNotNull(param.getRoleSort())) {
            wrapper.eq(SysRole::getRoleSort, param.getRoleSort());
            }

            // 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
            if (StrUtil.isNotBlank(param.getDataScope())) {
            wrapper.eq(SysRole::getDataScope, param.getDataScope());
            }

            // 菜单树选择项是否关联显示
            if (ObjectUtil.isNotNull(param.getMenuCheckStrictly())) {
            wrapper.eq(SysRole::getMenuCheckStrictly, param.getMenuCheckStrictly());
            }

            // 部门树选择项是否关联显示
            if (ObjectUtil.isNotNull(param.getDeptCheckStrictly())) {
            wrapper.eq(SysRole::getDeptCheckStrictly, param.getDeptCheckStrictly());
            }

            // 角色状态（0正常 1停用）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysRole::getStatus, param.getStatus());
            }

            // 删除标志（0代表存在 2代表删除）
            if (StrUtil.isNotBlank(param.getDelFlag())) {
            wrapper.eq(SysRole::getDelFlag, param.getDelFlag());
            }

            // 备注
            if (StrUtil.isNotBlank(param.getRemark())) {
            wrapper.eq(SysRole::getRemark, param.getRemark());
            }
            wrapper.orderByDesc(SysRole::getCreateTime);
        }
        return wrapper;
    }


}
