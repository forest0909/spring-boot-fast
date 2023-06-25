package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysOperLog;
import com.forest.system.entity.param.SysOperLogParam;

import java.util.List;

/**
 * <p>
 * 操作日志记录 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysOperLogService extends TBaseService<SysOperLog>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysOperLog> list(SysOperLogParam param);
}
