package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysUserPost;
import com.forest.system.entity.param.SysUserPostParam;

import java.util.List;

/**
 * <p>
 * 用户与岗位关联表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysUserPostService extends TBaseService<SysUserPost>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysUserPost> list(SysUserPostParam param);
}
