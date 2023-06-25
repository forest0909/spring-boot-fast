package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysPost;
import com.forest.system.entity.param.SysPostParam;

import java.util.List;

/**
 * <p>
 * 岗位信息表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysPostService extends TBaseService<SysPost>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysPost> list(SysPostParam param);
}
