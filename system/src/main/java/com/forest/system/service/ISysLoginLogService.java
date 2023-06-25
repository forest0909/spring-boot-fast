package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysLoginLog;
import com.forest.system.entity.param.SysLoginLogParam;

import java.util.List;

/**
 * <p>
 * 系统访问记录 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysLoginLogService extends TBaseService<SysLoginLog>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysLoginLog> list(SysLoginLogParam param);
}
