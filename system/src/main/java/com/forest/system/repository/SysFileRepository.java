package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysFile;
import com.forest.system.entity.param.SysFileParam;
import com.forest.system.mapper.SysFileMapper;

import java.util.List;

/**
 * <p>
 * 上传文件 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysFileRepository extends TBaseRepository<SysFile>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysFile> list(SysFileParam param);

    /**
    * 获取mapper
    */
    SysFileMapper getMapper();

}
