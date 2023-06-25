package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysDept;
import com.forest.system.entity.param.SysDeptParam;
import com.forest.system.repository.SysDeptRepository;
import com.forest.system.service.ISysDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysDeptServiceImpl extends TBaseServiceImpl<SysDeptRepository,SysDept> implements ISysDeptService {
    @Resource
    SysDeptRepository sysDeptRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysDept> list(SysDeptParam param) {
        return sysDeptRepository.list(param);
    }
}
