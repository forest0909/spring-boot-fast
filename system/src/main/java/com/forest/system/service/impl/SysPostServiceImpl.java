package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysPost;
import com.forest.system.entity.param.SysPostParam;
import com.forest.system.repository.SysPostRepository;
import com.forest.system.service.ISysPostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 岗位信息表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysPostServiceImpl extends TBaseServiceImpl<SysPostRepository,SysPost> implements ISysPostService {
    @Resource
    SysPostRepository sysPostRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysPost> list(SysPostParam param) {
        return sysPostRepository.list(param);
    }
}
