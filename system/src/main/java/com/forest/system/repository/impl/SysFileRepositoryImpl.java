package com.forest.system.repository.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import com.forest.system.entity.model.SysFile;
import com.forest.system.entity.param.SysFileParam;
import com.forest.system.mapper.SysFileMapper;
import com.forest.system.repository.SysFileRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public class SysFileRepositoryImpl extends TBaseRepositoryImpl<SysFileMapper, SysFile> implements SysFileRepository {
    @Resource
    SysFileMapper sysFileMapper;

    /**
    * 获取mapper
    */
    public SysFileMapper getMapper(){
        return sysFileMapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<SysFile> list(SysFileParam param) {
        return sysFileMapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<SysFile> getWrapper(SysFileParam param) {
    LambdaQueryWrapper<SysFile> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {

            // 文件名
            if (StrUtil.isNotBlank(param.getFileName())) {
            wrapper.eq(SysFile::getFileName, param.getFileName());
            }

            // 文件路径
            if (StrUtil.isNotBlank(param.getFilePath())) {
            wrapper.eq(SysFile::getFilePath, param.getFilePath());
            }

            // 文件类型
            if (StrUtil.isNotBlank(param.getFileType())) {
            wrapper.eq(SysFile::getFileType, param.getFileType());
            }

            // 文件大小
            if (StrUtil.isNotBlank(param.getFileSize())) {
            wrapper.eq(SysFile::getFileSize, param.getFileSize());
            }

            // 上传来源类型 1:红黑榜 2:抄告单 3:督办单 4:回复函
            if (StrUtil.isNotBlank(param.getFileSourceType())) {
            wrapper.eq(SysFile::getFileSourceType, param.getFileSourceType());
            }
            wrapper.orderByDesc(SysFile::getCreateTime);
        }
        return wrapper;
    }


}
