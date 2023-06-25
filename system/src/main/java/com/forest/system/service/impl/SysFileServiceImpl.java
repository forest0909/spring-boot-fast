package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysFile;
import com.forest.system.entity.param.SysFileParam;
import com.forest.system.repository.SysFileRepository;
import com.forest.system.service.ISysFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 上传文件 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysFileServiceImpl extends TBaseServiceImpl<SysFileRepository,SysFile> implements ISysFileService {
    @Resource
    SysFileRepository sysFileRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysFile> list(SysFileParam param) {
        return sysFileRepository.list(param);
    }
}
