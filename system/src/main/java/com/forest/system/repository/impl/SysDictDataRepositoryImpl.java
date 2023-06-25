package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysDictData;
import com.forest.system.entity.param.SysDictDataParam;
import com.forest.system.mapper.SysDictDataMapper;
import com.forest.system.repository.SysDictDataRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 字典数据表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Repository
public class SysDictDataRepositoryImpl extends TBaseRepositoryImpl<SysDictDataMapper, SysDictData> implements SysDictDataRepository {
    @Resource
    SysDictDataMapper sysDictDataMapper;

    /**
    * 获取mapper
    */
    public SysDictDataMapper getMapper(){
        return sysDictDataMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysDictData> list(SysDictDataParam param) {
        return sysDictDataMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysDictData> getWrapper(SysDictDataParam param) {
    LambdaQueryWrapper<SysDictData> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 字典编码
            if (StrUtil.isNotBlank(param.getDictCode())) {
            wrapper.eq(SysDictData::getDictCode, param.getDictCode());
            }

            // 字典排序
            if (ObjectUtil.isNotNull(param.getDictSort())) {
            wrapper.eq(SysDictData::getDictSort, param.getDictSort());
            }

            // 字典标签
            if (StrUtil.isNotBlank(param.getDictLabel())) {
            wrapper.eq(SysDictData::getDictLabel, param.getDictLabel());
            }

            // 字典键值
            if (StrUtil.isNotBlank(param.getDictValue())) {
            wrapper.eq(SysDictData::getDictValue, param.getDictValue());
            }

            // 字典类型
            if (StrUtil.isNotBlank(param.getDictType())) {
            wrapper.eq(SysDictData::getDictType, param.getDictType());
            }

            // 样式属性（其他样式扩展）
            if (StrUtil.isNotBlank(param.getCssClass())) {
            wrapper.eq(SysDictData::getCssClass, param.getCssClass());
            }

            // 表格回显样式
            if (StrUtil.isNotBlank(param.getListClass())) {
            wrapper.eq(SysDictData::getListClass, param.getListClass());
            }

            // 是否默认（Y是 N否）
            if (StrUtil.isNotBlank(param.getIsDefault())) {
            wrapper.eq(SysDictData::getIsDefault, param.getIsDefault());
            }

            // 状态（0正常 1停用）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysDictData::getStatus, param.getStatus());
            }

            // 备注
            if (StrUtil.isNotBlank(param.getRemark())) {
            wrapper.eq(SysDictData::getRemark, param.getRemark());
            }
            wrapper.orderByDesc(SysDictData::getCreateTime);
        }
        return wrapper;
    }


}
