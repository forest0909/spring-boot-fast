package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysDept;
import com.forest.system.entity.param.SysDeptParam;

import java.util.List;

/**
 * <p>
 * 部门表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysDeptService extends TBaseService<SysDept>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysDept> list(SysDeptParam param);
}
