package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysDictData;
import com.forest.system.entity.param.SysDictDataParam;
import com.forest.system.repository.SysDictDataRepository;
import com.forest.system.service.ISysDictDataService;
import org.springframework.stereotype.Service;

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
@Service
public class SysDictDataServiceImpl extends TBaseServiceImpl<SysDictDataRepository,SysDictData> implements ISysDictDataService {
    @Resource
    SysDictDataRepository sysDictDataRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysDictData> list(SysDictDataParam param) {
        return sysDictDataRepository.list(param);
    }
}
