package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysLoginLog;
import com.forest.system.entity.param.SysLoginLogParam;
import com.forest.system.repository.SysLoginLogRepository;
import com.forest.system.service.ISysLoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 系统访问记录 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysLoginLogServiceImpl extends TBaseServiceImpl<SysLoginLogRepository,SysLoginLog> implements ISysLoginLogService {
    @Resource
    SysLoginLogRepository sysLoginLogRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysLoginLog> list(SysLoginLogParam param) {
        return sysLoginLogRepository.list(param);
    }
}
