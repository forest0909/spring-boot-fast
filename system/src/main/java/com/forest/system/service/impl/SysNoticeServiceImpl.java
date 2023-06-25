package com.forest.system.service.impl;

import com.forest.core.base.TBaseServiceImpl;
import com.forest.system.entity.model.SysNotice;
import com.forest.system.entity.param.SysNoticeParam;
import com.forest.system.repository.SysNoticeRepository;
import com.forest.system.service.ISysNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 通知公告表 服务实现类
 * </p>
 *
 * @author zzl
 * @since 2023-06-25
 */
@Service
public class SysNoticeServiceImpl extends TBaseServiceImpl<SysNoticeRepository,SysNotice> implements ISysNoticeService {
    @Resource
    SysNoticeRepository sysNoticeRepository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysNotice> list(SysNoticeParam param) {
        return sysNoticeRepository.list(param);
    }
}
