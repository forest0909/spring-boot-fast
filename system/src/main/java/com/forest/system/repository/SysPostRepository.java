package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysPost;
import com.forest.system.entity.param.SysPostParam;
import com.forest.system.mapper.SysPostMapper;

import java.util.List;

/**
 * <p>
 * 岗位信息表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysPostRepository extends TBaseRepository<SysPost>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysPost> list(SysPostParam param);

    /**
    * 获取mapper
    */
    SysPostMapper getMapper();

}
