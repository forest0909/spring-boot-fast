package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysDictData;
import com.forest.system.entity.param.SysDictDataParam;
import com.forest.system.mapper.SysDictDataMapper;

import java.util.List;

/**
 * <p>
 * 字典数据表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysDictDataRepository extends TBaseRepository<SysDictData>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysDictData> list(SysDictDataParam param);

    /**
    * 获取mapper
    */
    SysDictDataMapper getMapper();

}
