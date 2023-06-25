package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysUserPost;
import com.forest.system.entity.param.SysUserPostParam;
import com.forest.system.mapper.SysUserPostMapper;
import com.forest.system.repository.SysUserPostRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户与岗位关联表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysUserPostRepositoryImpl extends TBaseRepositoryImpl<SysUserPostMapper, SysUserPost> implements SysUserPostRepository {
    @Resource
    SysUserPostMapper sysUserPostMapper;

    /**
    * 获取mapper
    */
    public SysUserPostMapper getMapper(){
        return sysUserPostMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysUserPost> list(SysUserPostParam param) {
        return sysUserPostMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysUserPost> getWrapper(SysUserPostParam param) {
    LambdaQueryWrapper<SysUserPost> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 用户ID
            if (ObjectUtil.isNotNull(param.getUserId())) {
            wrapper.eq(SysUserPost::getUserId, param.getUserId());
            }

            // 岗位ID
            if (ObjectUtil.isNotNull(param.getPostId())) {
            wrapper.eq(SysUserPost::getPostId, param.getPostId());
            }
            wrapper.orderByDesc(SysUserPost::getCreateTime);
        }
        return wrapper;
    }


}
