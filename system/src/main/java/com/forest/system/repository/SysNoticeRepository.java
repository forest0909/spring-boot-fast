package com.forest.system.repository;

import com.forest.core.base.TBaseRepository;
import com.forest.system.entity.model.SysNotice;
import com.forest.system.entity.param.SysNoticeParam;
import com.forest.system.mapper.SysNoticeMapper;

import java.util.List;

/**
 * <p>
 * 通知公告表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface SysNoticeRepository extends TBaseRepository<SysNotice>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysNotice> list(SysNoticeParam param);

    /**
    * 获取mapper
    */
    SysNoticeMapper getMapper();

}
