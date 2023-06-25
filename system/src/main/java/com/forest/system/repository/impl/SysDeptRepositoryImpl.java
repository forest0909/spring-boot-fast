package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysDept;
import com.forest.system.entity.param.SysDeptParam;
import com.forest.system.mapper.SysDeptMapper;
import com.forest.system.repository.SysDeptRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysDeptRepositoryImpl extends TBaseRepositoryImpl<SysDeptMapper, SysDept> implements SysDeptRepository {
    @Resource
    SysDeptMapper sysDeptMapper;

    /**
    * 获取mapper
    */
    public SysDeptMapper getMapper(){
        return sysDeptMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysDept> list(SysDeptParam param) {
        return sysDeptMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysDept> getWrapper(SysDeptParam param) {
    LambdaQueryWrapper<SysDept> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 父部门id
            if (ObjectUtil.isNotNull(param.getParentId())) {
            wrapper.eq(SysDept::getParentId, param.getParentId());
            }

            // 祖级列表
            if (StrUtil.isNotBlank(param.getAncestors())) {
            wrapper.eq(SysDept::getAncestors, param.getAncestors());
            }

            // 部门名称
            if (StrUtil.isNotBlank(param.getDeptName())) {
            wrapper.eq(SysDept::getDeptName, param.getDeptName());
            }

            // 显示顺序
            if (ObjectUtil.isNotNull(param.getOrderNum())) {
            wrapper.eq(SysDept::getOrderNum, param.getOrderNum());
            }

            // 负责人
            if (StrUtil.isNotBlank(param.getLeader())) {
            wrapper.eq(SysDept::getLeader, param.getLeader());
            }

            // 联系电话
            if (StrUtil.isNotBlank(param.getPhone())) {
            wrapper.eq(SysDept::getPhone, param.getPhone());
            }

            // 邮箱
            if (StrUtil.isNotBlank(param.getEmail())) {
            wrapper.eq(SysDept::getEmail, param.getEmail());
            }

            // 部门状态（0正常 1停用）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysDept::getStatus, param.getStatus());
            }

            // 删除标志（0代表存在 2代表删除）
            if (StrUtil.isNotBlank(param.getDelFlag())) {
            wrapper.eq(SysDept::getDelFlag, param.getDelFlag());
            }
            wrapper.orderByDesc(SysDept::getCreateTime);
        }
        return wrapper;
    }


}
