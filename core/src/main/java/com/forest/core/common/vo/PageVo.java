package com.forest.core.common.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzl
 * @version 1.0
 * ClassName：PageVo
 * Date：2023/6/21
 * Description：
 */
public class PageVo<T> {

    /**
     * 总页数
     **/
    private Integer pages;


    /**
     * 每页条数
     **/
    private Integer pageSize;

    /**
     * 总条数
     **/
    private Integer total;

    private Integer pageNum;

    /**
     * 数据列表
     **/
    private List<T> records;

    private PageVo() {
    }

    public static <T> PageVo<T> build(IPage<T> iPage) {
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setPageNum(Double.valueOf(iPage.getCurrent()).intValue());
        pageVo.setRecords(iPage.getRecords());
        pageVo.setPageSize(Double.valueOf(iPage.getSize()).intValue());
        pageVo.setTotal(Double.valueOf(iPage.getTotal()).intValue());
        return pageVo;
    }

    public static <T> PageVo<T> empty() {
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setPageSize(0);
        pageVo.setRecords(new ArrayList<>());
        pageVo.setPageNum(0);
        pageVo.setTotal(0);
        return pageVo;
    }

    public static <T> PageVo<T> build(PageInfo<T> pageInfo) {
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setPageSize(pageInfo.getPageSize());
        pageVo.setRecords(pageInfo.getList());
        pageVo.setPageNum(pageInfo.getPageNum());
        pageVo.setTotal(Double.valueOf(pageInfo.getTotal()).intValue());
        return pageVo;
    }

    public static <T> PageVo<T> build(PageInfo<?> pageInfo, List<T> list) {
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setPageSize(pageInfo.getPageSize());
        pageVo.setRecords(list);
        pageVo.setPageNum(pageInfo.getPageNum());
        pageVo.setTotal(Double.valueOf(pageInfo.getTotal()).intValue());
        return pageVo;
    }

    public static <T> PageVo<T> build(Page<T> page) {
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setPageSize(page.getPageSize());
        pageVo.setRecords(page.getResult());
        pageVo.setPageNum(page.getPageNum());
        pageVo.setTotal(Long.valueOf(page.getTotal()).intValue());
        return pageVo;
    }

    public static <T> PageVo<T> build(Page<?> page, List<T> list) {
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setPageSize(page.getPageSize());
        pageVo.setRecords(list);
        pageVo.setPageNum(page.getPageNum());
        pageVo.setTotal(Long.valueOf(page.getTotal()).intValue());
        return pageVo;
    }

    public Integer getPages() {
        return pages;
    }

    protected void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getTotal() {
        return total;
    }

    protected void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


}
