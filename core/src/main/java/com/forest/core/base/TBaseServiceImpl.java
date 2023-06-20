package com.forest.core.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Service
public abstract  class TBaseServiceImpl<R extends TBaseRepository<T>, T> implements TBaseService<T>{

    @Autowired
    protected R baseRepository;

    /**
     * 查询所有数据
     *
     * @return
     */
    @Override
    public List<T> listAll() {
        return baseRepository.list();
    }

    /**
     * 新增数据
     * @param base
     * @return
     */
    @Override
    public Boolean save(T base) {
        return baseRepository.save(base);
    }

    /**
     * 保存或者更新
     *
     * @param base
     * @return
     */
    @Override
    public Boolean saveOrUpdate(T base) {
        return baseRepository.saveOrUpdate(base);
    }

    /**
     * 批量新增数据
     *
     * @param list
     * @return
     */
    @Override
    public Boolean saveBatch(List<T> list) {
        return baseRepository.saveBatch(list);
    }

    /**
     * 批量保存或者更新
     *
     * @param list
     * @return
     */
    @Override
    public Boolean saveOrUpdateBatch(List<T> list) {
        return baseRepository.saveOrUpdateBatch(list);
    }

    /**
     * 更新数据
     *
     * @param base
     * @return
     */
    @Override
    public Boolean updateById(T base) {
        return baseRepository.updateById(base);
    }

    /**
     * 批量更新数据
     *
     * @param list
     * @return
     */
    @Override
    public Boolean updateBatchById(List<T> list) {
        return baseRepository.updateBatchById(list);
    }

    /**
     * 详情
     *
     * @param id
     * @return
     */
    @Override
    public T getById(Serializable id) {
        return baseRepository.getById(id);
    }

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    @Override
    public Boolean removeById(Serializable id) {
        return baseRepository.removeById(id);
    }

    /**
     * 批量删除数据
     *
     * @param idList ids
     * @return
     */
    @Override
    public Boolean removeByIds(Collection<? extends Serializable> idList) {
        return baseRepository.removeByIds(idList);
    }
}
