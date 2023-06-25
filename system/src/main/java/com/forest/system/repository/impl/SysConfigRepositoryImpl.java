package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysConfig;
import com.forest.system.entity.param.SysConfigParam;
import com.forest.system.mapper.SysConfigMapper;
import com.forest.system.repository.SysConfigRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public class SysConfigRepositoryImpl extends TBaseRepositoryImpl<SysConfigMapper, SysConfig> implements SysConfigRepository {
    @Resource
    SysConfigMapper sysConfigMapper;

    /**
    * 获取mapper
    */
    public SysConfigMapper getMapper(){
        return sysConfigMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysConfig> list(SysConfigParam param) {
        return sysConfigMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysConfig> getWrapper(SysConfigParam param) {
    LambdaQueryWrapper<SysConfig> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 参数名称
            if (StrUtil.isNotBlank(param.getConfigName())) {
            wrapper.eq(SysConfig::getConfigName, param.getConfigName());
            }

            // 参数键名
            if (StrUtil.isNotBlank(param.getConfigKey())) {
            wrapper.eq(SysConfig::getConfigKey, param.getConfigKey());
            }

            // 参数键值
            if (StrUtil.isNotBlank(param.getConfigValue())) {
            wrapper.eq(SysConfig::getConfigValue, param.getConfigValue());
            }

            // 系统内置（Y是 N否）
            if (StrUtil.isNotBlank(param.getConfigType())) {
            wrapper.eq(SysConfig::getConfigType, param.getConfigType());
            }

            // 备注
            if (StrUtil.isNotBlank(param.getRemark())) {
            wrapper.eq(SysConfig::getRemark, param.getRemark());
            }
            wrapper.orderByDesc(SysConfig::getCreateTime);
        }
        return wrapper;
    }


}
