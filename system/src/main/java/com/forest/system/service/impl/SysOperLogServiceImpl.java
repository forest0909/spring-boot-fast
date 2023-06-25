package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysOperLog;
import com.forest.system.entity.param.SysOperLogParam;
import com.forest.system.repository.SysOperLogRepository;
import com.forest.system.service.ISysOperLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 操作日志记录 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysOperLogServiceImpl extends TBaseServiceImpl<SysOperLogRepository,SysOperLog> implements ISysOperLogService {
    @Resource
    SysOperLogRepository sysOperLogRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysOperLog> list(SysOperLogParam param) {
        return sysOperLogRepository.list(param);
    }
}
