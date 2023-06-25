package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysUserPost;
import com.forest.system.entity.param.SysUserPostParam;
import com.forest.system.mapper.SysUserPostMapper;

import java.util.List;

/**
 * <p>
 * 用户与岗位关联表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysUserPostRepository extends TBaseRepository<SysUserPost>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysUserPost> list(SysUserPostParam param);

    /**
    * 获取mapper
    */
    SysUserPostMapper getMapper();

}
