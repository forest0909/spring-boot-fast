package com.forest.core.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface TBaseService<T> {

    /**
     *  查询所有数据
     * @return
     */
    public List<T> listAll();

    /**
     *  保存数据
     * @param base
     * @return
     */
    public Boolean save(T base);

    /**
     *  保存或者更新
     * @param base
     * @return
     */
    public Boolean saveOrUpdate(T base);

    /**
     *  批量保存数据
     * @param list
     * @return
     */
    public Boolean saveBatch(List<T> list);
    /**
     *  批量保存或者更新
     * @param list
     * @return
     */
    public Boolean saveOrUpdateBatch(List<T> list);

    /**
     *  更新数据
     * @param base
     * @return
     */
    public Boolean updateById(T base);
    /**
     *  批量更新数据
     * @param list
     * @return
     */
    public Boolean updateBatchById(List<T> list);

    /**
     *  详情
     * @param id
     * @return
     */
    public T getById(Serializable id);

    /**
     *  删除数据
     * @param id
     * @return
     */
    public Boolean removeById(Serializable id);


    /**
     *  批量删除数据
     * @param ids  ids
     * @return
     */
    public Boolean removeByIds(Collection<? extends Serializable> ids);
}
