package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysNotice;
import com.forest.system.entity.param.SysNoticeParam;
import com.forest.system.mapper.SysNoticeMapper;
import com.forest.system.repository.SysNoticeRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public class SysNoticeRepositoryImpl extends TBaseRepositoryImpl<SysNoticeMapper, SysNotice> implements SysNoticeRepository {
    @Resource
    SysNoticeMapper sysNoticeMapper;

    /**
    * 获取mapper
    */
    public SysNoticeMapper getMapper(){
        return sysNoticeMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysNotice> list(SysNoticeParam param) {
        return sysNoticeMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysNotice> getWrapper(SysNoticeParam param) {
    LambdaQueryWrapper<SysNotice> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 公告标题
            if (StrUtil.isNotBlank(param.getNoticeTitle())) {
            wrapper.eq(SysNotice::getNoticeTitle, param.getNoticeTitle());
            }

            // 公告类型（1通知 2公告）
            if (StrUtil.isNotBlank(param.getNoticeType())) {
            wrapper.eq(SysNotice::getNoticeType, param.getNoticeType());
            }

            // 公告内容
            if (StrUtil.isNotBlank(param.getNoticeContent())) {
            wrapper.eq(SysNotice::getNoticeContent, param.getNoticeContent());
            }

            // 公告状态（0正常 1关闭）
            if (StrUtil.isNotBlank(param.getStatus())) {
            wrapper.eq(SysNotice::getStatus, param.getStatus());
            }

            // 备注
            if (StrUtil.isNotBlank(param.getRemark())) {
            wrapper.eq(SysNotice::getRemark, param.getRemark());
            }
            wrapper.orderByDesc(SysNotice::getCreateTime);
        }
        return wrapper;
    }


}
