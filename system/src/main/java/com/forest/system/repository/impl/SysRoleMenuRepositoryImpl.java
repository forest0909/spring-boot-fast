package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysRoleMenu;
import com.forest.system.entity.param.SysRoleMenuParam;
import com.forest.system.mapper.SysRoleMenuMapper;
import com.forest.system.repository.SysRoleMenuRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysRoleMenuRepositoryImpl extends TBaseRepositoryImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuRepository {
    @Resource
    SysRoleMenuMapper sysRoleMenuMapper;

    /**
    * 获取mapper
    */
    public SysRoleMenuMapper getMapper(){
        return sysRoleMenuMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysRoleMenu> list(SysRoleMenuParam param) {
        return sysRoleMenuMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysRoleMenu> getWrapper(SysRoleMenuParam param) {
    LambdaQueryWrapper<SysRoleMenu> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 角色ID
            if (ObjectUtil.isNotNull(param.getRoleId())) {
            wrapper.eq(SysRoleMenu::getRoleId, param.getRoleId());
            }

            // 菜单ID
            if (ObjectUtil.isNotNull(param.getMenuId())) {
            wrapper.eq(SysRoleMenu::getMenuId, param.getMenuId());
            }
            wrapper.orderByDesc(SysRoleMenu::getCreateTime);
        }
        return wrapper;
    }


}
