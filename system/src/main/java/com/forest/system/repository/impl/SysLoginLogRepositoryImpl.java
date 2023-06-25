package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysLoginLog;
import com.forest.system.entity.param.SysLoginLogParam;
import com.forest.system.mapper.SysLoginLogMapper;
import com.forest.system.repository.SysLoginLogRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 系统访问记录 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysLoginLogRepositoryImpl extends TBaseRepositoryImpl<SysLoginLogMapper, SysLoginLog> implements SysLoginLogRepository {
    @Resource
    SysLoginLogMapper sysLoginLogMapper;

    /**
    * 获取mapper
    */
    public SysLoginLogMapper getMapper(){
        return sysLoginLogMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysLoginLog> list(SysLoginLogParam param) {
        return sysLoginLogMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysLoginLog> getWrapper(SysLoginLogParam param) {
    LambdaQueryWrapper<SysLoginLog> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 用户账号
            if (StrUtil.isNotBlank(param.getUserName())) {
            wrapper.eq(SysLoginLog::getUserName, param.getUserName());
            }

            // 登录IP地址
            if (StrUtil.isNotBlank(param.getIpaddr())) {
            wrapper.eq(SysLoginLog::getIpaddr, param.getIpaddr());
            }

            // 登录地点
            if (StrUtil.isNotBlank(param.getLoginLocation())) {
            wrapper.eq(SysLoginLog::getLoginLocation, param.getLoginLocation());
            }

            // 浏览器类型
            if (StrUtil.isNotBlank(param.getBrowser())) {
            wrapper.eq(SysLoginLog::getBrowser, param.getBrowser());
            }

            // 操作系统
            if (StrUtil.isNotBlank(param.getOs())) {
            wrapper.eq(SysLoginLog::getOs, param.getOs());
            }

            // 登录状态（0成功 1失败）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysLoginLog::getStatus, param.getStatus());
            }

            // 提示消息
            if (StrUtil.isNotBlank(param.getMsg())) {
            wrapper.eq(SysLoginLog::getMsg, param.getMsg());
            }

            if (ObjectUtil.isNotNull(param.getLoginTimeStartTime())) {
                wrapper.ge(SysLoginLog::getLoginTime,param.getLoginTimeStartTime());
            }
            if (ObjectUtil.isNotNull(param.getLoginTimeEndTime())) {
                wrapper.le(SysLoginLog::getLoginTime,param.getLoginTimeEndTime());
            }
            wrapper.orderByDesc(SysLoginLog::getCreateTime);
        }
        return wrapper;
    }


}
