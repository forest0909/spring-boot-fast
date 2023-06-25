package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysDict;
import com.forest.system.entity.param.SysDictParam;
import com.forest.system.repository.SysDictRepository;
import com.forest.system.service.ISysDictService;
import org.springframework.stereotype.Service;

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
@Service
public class SysDictServiceImpl extends TBaseServiceImpl<SysDictRepository,SysDict> implements ISysDictService {
    @Resource
    SysDictRepository sysDictRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysDict> list(SysDictParam param) {
        return sysDictRepository.list(param);
    }
}
