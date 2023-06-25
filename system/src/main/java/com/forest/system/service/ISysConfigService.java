package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysConfig;
import com.forest.system.entity.param.SysConfigParam;

import java.util.List;

/**
 * <p>
 * 参数配置表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysConfigService extends TBaseService<SysConfig>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysConfig> list(SysConfigParam param);
}
