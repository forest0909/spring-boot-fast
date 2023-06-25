package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysDict;
import com.forest.system.entity.param.SysDictParam;
import com.forest.system.mapper.SysDictMapper;
import com.forest.system.repository.SysDictRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 字典类型表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysDictRepositoryImpl extends TBaseRepositoryImpl<SysDictMapper, SysDict> implements SysDictRepository {
    @Resource
    SysDictMapper sysDictMapper;

    /**
    * 获取mapper
    */
    public SysDictMapper getMapper(){
        return sysDictMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysDict> list(SysDictParam param) {
        return sysDictMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysDict> getWrapper(SysDictParam param) {
    LambdaQueryWrapper<SysDict> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 字典名称
            if (StrUtil.isNotBlank(param.getDictName())) {
            wrapper.eq(SysDict::getDictName, param.getDictName());
            }

            // 字典类型
            if (StrUtil.isNotBlank(param.getDictType())) {
            wrapper.eq(SysDict::getDictType, param.getDictType());
            }

            // 状态（0正常 1停用）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysDict::getStatus, param.getStatus());
            }

            // 备注
            if (StrUtil.isNotBlank(param.getRemark())) {
            wrapper.eq(SysDict::getRemark, param.getRemark());
            }
            wrapper.orderByDesc(SysDict::getCreateTime);
        }
        return wrapper;
    }


}
