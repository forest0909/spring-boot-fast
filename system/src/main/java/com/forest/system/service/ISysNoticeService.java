package com.forest.system.service;

import com.forest.core.base.TBaseService;
import com.forest.system.entity.model.SysNotice;
import com.forest.system.entity.param.SysNoticeParam;

import java.util.List;

/**
 * <p>
 * 通知公告表 服务类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
public interface ISysNoticeService extends TBaseService<SysNotice>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<SysNotice> list(SysNoticeParam param);
}
