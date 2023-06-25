package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysPost;
import com.forest.system.entity.param.SysPostParam;
import com.forest.system.mapper.SysPostMapper;
import com.forest.system.repository.SysPostRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 岗位信息表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysPostRepositoryImpl extends TBaseRepositoryImpl<SysPostMapper, SysPost> implements SysPostRepository {
    @Resource
    SysPostMapper sysPostMapper;

    /**
    * 获取mapper
    */
    public SysPostMapper getMapper(){
        return sysPostMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysPost> list(SysPostParam param) {
        return sysPostMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysPost> getWrapper(SysPostParam param) {
    LambdaQueryWrapper<SysPost> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 岗位编码
            if (StrUtil.isNotBlank(param.getPostCode())) {
            wrapper.eq(SysPost::getPostCode, param.getPostCode());
            }

            // 岗位名称
            if (StrUtil.isNotBlank(param.getPostName())) {
            wrapper.eq(SysPost::getPostName, param.getPostName());
            }

            // 显示顺序
            if (ObjectUtil.isNotNull(param.getPostSort())) {
            wrapper.eq(SysPost::getPostSort, param.getPostSort());
            }

            // 状态（0正常 1停用）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysPost::getStatus, param.getStatus());
            }

            // 备注
            if (StrUtil.isNotBlank(param.getRemark())) {
            wrapper.eq(SysPost::getRemark, param.getRemark());
            }

            // 删除标志（0代表存在 2代表删除）
            if (StrUtil.isNotBlank(param.getDelFlag())) {
            wrapper.eq(SysPost::getDelFlag, param.getDelFlag());
            }
            wrapper.orderByDesc(SysPost::getCreateTime);
        }
        return wrapper;
    }


}
