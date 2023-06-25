package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysOperLog;
import com.forest.system.entity.param.SysOperLogParam;
import com.forest.system.mapper.SysOperLogMapper;
import com.forest.system.repository.SysOperLogRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 操作日志记录 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysOperLogRepositoryImpl extends TBaseRepositoryImpl<SysOperLogMapper, SysOperLog> implements SysOperLogRepository {
    @Resource
    SysOperLogMapper sysOperLogMapper;

    /**
    * 获取mapper
    */
    public SysOperLogMapper getMapper(){
        return sysOperLogMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysOperLog> list(SysOperLogParam param) {
        return sysOperLogMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysOperLog> getWrapper(SysOperLogParam param) {
    LambdaQueryWrapper<SysOperLog> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 模块标题
            if (StrUtil.isNotBlank(param.getTitle())) {
            wrapper.eq(SysOperLog::getTitle, param.getTitle());
            }

            // 业务类型（0其它 1新增 2修改 3删除）
            if (ObjectUtil.isNotNull(param.getBusinessType())) {
            wrapper.eq(SysOperLog::getBusinessType, param.getBusinessType());
            }

            // 方法名称
            if (StrUtil.isNotBlank(param.getMethod())) {
            wrapper.eq(SysOperLog::getMethod, param.getMethod());
            }

            // 请求方式
            if (StrUtil.isNotBlank(param.getRequestMethod())) {
            wrapper.eq(SysOperLog::getRequestMethod, param.getRequestMethod());
            }

            // 操作类别（0其它 1后台用户 2手机端用户）
            if (ObjectUtil.isNotNull(param.getOperatorType())) {
            wrapper.eq(SysOperLog::getOperatorType, param.getOperatorType());
            }

            // 操作人员
            if (StrUtil.isNotBlank(param.getOperName())) {
            wrapper.eq(SysOperLog::getOperName, param.getOperName());
            }

            // 部门名称
            if (StrUtil.isNotBlank(param.getDeptName())) {
            wrapper.eq(SysOperLog::getDeptName, param.getDeptName());
            }

            // 请求URL
            if (StrUtil.isNotBlank(param.getOperUrl())) {
            wrapper.eq(SysOperLog::getOperUrl, param.getOperUrl());
            }

            // 主机地址
            if (StrUtil.isNotBlank(param.getOperIp())) {
            wrapper.eq(SysOperLog::getOperIp, param.getOperIp());
            }

            // 操作地点
            if (StrUtil.isNotBlank(param.getOperLocation())) {
            wrapper.eq(SysOperLog::getOperLocation, param.getOperLocation());
            }

            // 请求参数
            if (StrUtil.isNotBlank(param.getOperParam())) {
            wrapper.eq(SysOperLog::getOperParam, param.getOperParam());
            }

            // 返回参数
            if (StrUtil.isNotBlank(param.getJsonResult())) {
            wrapper.eq(SysOperLog::getJsonResult, param.getJsonResult());
            }

            // 操作状态（0正常 1异常）
            if (ObjectUtil.isNotNull(param.getStatus())) {
            wrapper.eq(SysOperLog::getStatus, param.getStatus());
            }

            // 错误消息
            if (StrUtil.isNotBlank(param.getErrorMsg())) {
            wrapper.eq(SysOperLog::getErrorMsg, param.getErrorMsg());
            }

            if (ObjectUtil.isNotNull(param.getOperTimeStartTime())) {
                wrapper.ge(SysOperLog::getOperTime,param.getOperTimeStartTime());
            }
            if (ObjectUtil.isNotNull(param.getOperTimeEndTime())) {
                wrapper.le(SysOperLog::getOperTime,param.getOperTimeEndTime());
            }

            // 消耗时间
            if (ObjectUtil.isNotNull(param.getCostTime())) {
            wrapper.eq(SysOperLog::getCostTime, param.getCostTime());
            }
            wrapper.orderByDesc(SysOperLog::getCreateTime);
        }
        return wrapper;
    }


}
