package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysOperLog;
import com.forest.system.entity.param.SysOperLogParam;
import com.forest.system.mapper.SysOperLogMapper;

import java.util.List;

/**
 * <p>
 * 操作日志记录 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysOperLogRepository extends TBaseRepository<SysOperLog>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysOperLog> list(SysOperLogParam param);

    /**
    * 获取mapper
    */
    SysOperLogMapper getMapper();

}
