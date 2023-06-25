package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysUser;
import com.forest.system.entity.param.SysUserParam;
import com.forest.system.mapper.SysUserMapper;
import com.forest.system.repository.SysUserRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysUserRepositoryImpl extends TBaseRepositoryImpl<SysUserMapper, SysUser> implements SysUserRepository {
    @Resource
    SysUserMapper sysUserMapper;

    /**
    * 获取mapper
    */
    public SysUserMapper getMapper(){
        return sysUserMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysUser> list(SysUserParam param) {
        return sysUserMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysUser> getWrapper(SysUserParam param) {
    LambdaQueryWrapper<SysUser> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 登录账号
            if (StrUtil.isNotBlank(param.getUserName())) {
            wrapper.eq(SysUser::getUserName, param.getUserName());
            }

            // 真实姓名
            if (StrUtil.isNotBlank(param.getRealName())) {
            wrapper.eq(SysUser::getRealName, param.getRealName());
            }

            // 密码
            if (StrUtil.isNotBlank(param.getPassword())) {
            wrapper.eq(SysUser::getPassword, param.getPassword());
            }

            // md5密码盐
            if (StrUtil.isNotBlank(param.getSalt())) {
            wrapper.eq(SysUser::getSalt, param.getSalt());
            }

            // 头像
            if (StrUtil.isNotBlank(param.getAvatar())) {
            wrapper.eq(SysUser::getAvatar, param.getAvatar());
            }

            // 性别(0-默认未知,1-男,2-女)
            if (ObjectUtil.isNotNull(param.getSex())) {
            wrapper.eq(SysUser::getSex, param.getSex());
            }

            // 电子邮件
            if (StrUtil.isNotBlank(param.getEmail())) {
            wrapper.eq(SysUser::getEmail, param.getEmail());
            }

            // 电话
            if (StrUtil.isNotBlank(param.getPhone())) {
            wrapper.eq(SysUser::getPhone, param.getPhone());
            }

            // 部门id
            if (ObjectUtil.isNotNull(param.getDeptId())) {
            wrapper.eq(SysUser::getDeptId, param.getDeptId());
            }

            // 帐号状态（0正常 1停用）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysUser::getStatus, param.getStatus());
            }

            // 是否是管理员（0否  1是）
            if (StrUtil.isNotBlank(param.getAdminFlag())) {
            wrapper.eq(SysUser::getAdminFlag, param.getAdminFlag());
            }

            // 最后登录IP
            if (StrUtil.isNotBlank(param.getLoginIp())) {
            wrapper.eq(SysUser::getLoginIp, param.getLoginIp());
            }

            if (ObjectUtil.isNotNull(param.getLoginDateStartTime())) {
                wrapper.ge(SysUser::getLoginDate,param.getLoginDateStartTime());
            }
            if (ObjectUtil.isNotNull(param.getLoginDateEndTime())) {
                wrapper.le(SysUser::getLoginDate,param.getLoginDateEndTime());
            }

            // 删除标志（0代表存在 2代表删除）
            if (StrUtil.isNotBlank(param.getDelFlag())) {
            wrapper.eq(SysUser::getDelFlag, param.getDelFlag());
            }

            // 备注
            if (StrUtil.isNotBlank(param.getRemark())) {
            wrapper.eq(SysUser::getRemark, param.getRemark());
            }
            wrapper.orderByDesc(SysUser::getCreateTime);
        }
        return wrapper;
    }


}
