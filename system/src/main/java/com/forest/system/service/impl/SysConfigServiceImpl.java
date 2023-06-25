package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysConfig;
import com.forest.system.entity.param.SysConfigParam;
import com.forest.system.repository.SysConfigRepository;
import com.forest.system.service.ISysConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 参数配置表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysConfigServiceImpl extends TBaseServiceImpl<SysConfigRepository,SysConfig> implements ISysConfigService {
    @Resource
    SysConfigRepository sysConfigRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysConfig> list(SysConfigParam param) {
        return sysConfigRepository.list(param);
    }
}
