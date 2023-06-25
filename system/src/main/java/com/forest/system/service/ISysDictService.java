package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysDict;
import com.forest.system.entity.param.SysDictParam;

import java.util.List;

/**
 * <p>
 * 字典类型表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysDictService extends TBaseService<SysDict>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysDict> list(SysDictParam param);
}
