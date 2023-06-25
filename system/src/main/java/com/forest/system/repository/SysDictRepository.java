package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysDict;
import com.forest.system.entity.param.SysDictParam;
import com.forest.system.mapper.SysDictMapper;

import java.util.List;

/**
 * <p>
 * 字典类型表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysDictRepository extends TBaseRepository<SysDict>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysDict> list(SysDictParam param);

    /**
    * 获取mapper
    */
    SysDictMapper getMapper();

}
