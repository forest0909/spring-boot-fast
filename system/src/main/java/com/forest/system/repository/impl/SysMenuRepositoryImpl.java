package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysMenu;
import com.forest.system.entity.param.SysMenuParam;
import com.forest.system.mapper.SysMenuMapper;
import com.forest.system.repository.SysMenuRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 菜单权限表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysMenuRepositoryImpl extends TBaseRepositoryImpl<SysMenuMapper, SysMenu> implements SysMenuRepository {
    @Resource
    SysMenuMapper sysMenuMapper;

    /**
    * 获取mapper
    */
    public SysMenuMapper getMapper(){
        return sysMenuMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysMenu> list(SysMenuParam param) {
        return sysMenuMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysMenu> getWrapper(SysMenuParam param) {
    LambdaQueryWrapper<SysMenu> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 菜单名称
            if (StrUtil.isNotBlank(param.getMenuName())) {
            wrapper.eq(SysMenu::getMenuName, param.getMenuName());
            }

            // 父菜单ID
            if (ObjectUtil.isNotNull(param.getParentId())) {
            wrapper.eq(SysMenu::getParentId, param.getParentId());
            }

            // 显示顺序
            if (ObjectUtil.isNotNull(param.getOrderNum())) {
            wrapper.eq(SysMenu::getOrderNum, param.getOrderNum());
            }

            // 路由地址
            if (StrUtil.isNotBlank(param.getPath())) {
            wrapper.eq(SysMenu::getPath, param.getPath());
            }

            // 组件路径
            if (StrUtil.isNotBlank(param.getComponent())) {
            wrapper.eq(SysMenu::getComponent, param.getComponent());
            }

            // 路由参数
            if (StrUtil.isNotBlank(param.getQuery())) {
            wrapper.eq(SysMenu::getQuery, param.getQuery());
            }

            // 是否为外链（0是 1否）
            if (ObjectUtil.isNotNull(param.getIsFrame())) {
            wrapper.eq(SysMenu::getIsFrame, param.getIsFrame());
            }

            // 是否缓存（0缓存 1不缓存）
            if (ObjectUtil.isNotNull(param.getIsCache())) {
            wrapper.eq(SysMenu::getIsCache, param.getIsCache());
            }

            // 菜单类型（M目录 C菜单 F按钮）
            if (StrUtil.isNotBlank(param.getMenuType())) {
            wrapper.eq(SysMenu::getMenuType, param.getMenuType());
            }

            // 菜单状态（0显示 1隐藏）
            if (StrUtil.isNotBlank(param.getVisible())) {
            wrapper.eq(SysMenu::getVisible, param.getVisible());
            }

            // 菜单状态（0正常 1停用）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysMenu::getStatus, param.getStatus());
            }

            // 权限标识
            if (StrUtil.isNotBlank(param.getPerms())) {
            wrapper.eq(SysMenu::getPerms, param.getPerms());
            }

            // 菜单图标
            if (StrUtil.isNotBlank(param.getIcon())) {
            wrapper.eq(SysMenu::getIcon, param.getIcon());
            }

            // 备注
            if (StrUtil.isNotBlank(param.getRemark())) {
            wrapper.eq(SysMenu::getRemark, param.getRemark());
            }
            wrapper.orderByDesc(SysMenu::getCreateTime);
        }
        return wrapper;
    }


}
