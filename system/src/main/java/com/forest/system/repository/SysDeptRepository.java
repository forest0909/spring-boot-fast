package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysDept;
import com.forest.system.entity.param.SysDeptParam;
import com.forest.system.mapper.SysDeptMapper;

import java.util.List;

/**
 * <p>
 * 部门表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysDeptRepository extends TBaseRepository<SysDept>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysDept> list(SysDeptParam param);

    /**
    * 获取mapper
    */
    SysDeptMapper getMapper();

}
