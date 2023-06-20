package com.forest.core.base;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface TBaseRepository<T> extends IService<T> {

    public List<T> list(LambdaQueryWrapper<T> wrapper) ;


}
