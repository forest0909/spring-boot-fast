package com.forest.core.base;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class TBaseRepositoryImpl<M extends TBaseMapper<T>, T> extends ServiceImpl<M,T> implements TBaseRepository<T> {

    @Autowired
    protected M tBaseMapper;

    public List<T> list(LambdaQueryWrapper<T> wrapper) {
        return tBaseMapper.selectList(wrapper);
    }


}
