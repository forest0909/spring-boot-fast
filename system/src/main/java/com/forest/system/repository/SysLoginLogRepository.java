package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysLoginLog;
import com.forest.system.entity.param.SysLoginLogParam;
import com.forest.system.mapper.SysLoginLogMapper;

import java.util.List;

/**
 * <p>
 * 系统访问记录 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysLoginLogRepository extends TBaseRepository<SysLoginLog>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysLoginLog> list(SysLoginLogParam param);

    /**
    * 获取mapper
    */
    SysLoginLogMapper getMapper();

}
