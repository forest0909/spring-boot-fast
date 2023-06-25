package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysConfig;
import com.forest.system.entity.param.SysConfigParam;
import com.forest.system.mapper.SysConfigMapper;

import java.util.List;

/**
 * <p>
 * 参数配置表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysConfigRepository extends TBaseRepository<SysConfig>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysConfig> list(SysConfigParam param);

    /**
    * 获取mapper
    */
    SysConfigMapper getMapper();

}
