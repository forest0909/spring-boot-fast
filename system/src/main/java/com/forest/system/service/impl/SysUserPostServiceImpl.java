package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysUserPost;
import com.forest.system.entity.param.SysUserPostParam;
import com.forest.system.repository.SysUserPostRepository;
import com.forest.system.service.ISysUserPostService;
import org.springframework.stereotype.Service;

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
@Service
public class SysUserPostServiceImpl extends TBaseServiceImpl<SysUserPostRepository,SysUserPost> implements ISysUserPostService {
    @Resource
    SysUserPostRepository sysUserPostRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysUserPost> list(SysUserPostParam param) {
        return sysUserPostRepository.list(param);
    }
}
