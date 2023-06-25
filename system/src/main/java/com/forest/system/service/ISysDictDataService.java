package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysDictData;
import com.forest.system.entity.param.SysDictDataParam;

import java.util.List;

/**
 * <p>
 * 字典数据表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysDictDataService extends TBaseService<SysDictData>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysDictData> list(SysDictDataParam param);
}
