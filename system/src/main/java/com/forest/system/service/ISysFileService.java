package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysFile;
import com.forest.system.entity.param.SysFileParam;

import java.util.List;

/**
 * <p>
 * 上传文件 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysFileService extends TBaseService<SysFile>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysFile> list(SysFileParam param);
}
