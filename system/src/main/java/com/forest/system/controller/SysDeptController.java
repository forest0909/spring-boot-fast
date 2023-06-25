package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysDept;
import com.forest.system.entity.param.SysDeptParam;
import com.forest.system.entity.vo.SysDeptVo;
import com.forest.system.service.ISysDeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 部门表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "部门表控制层", tags = "部门表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-dept")
public class SysDeptController {
    @Resource
    public ISysDeptService sysDeptService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysDept>> listPage(SysDeptParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysDept> list = sysDeptService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysDeptVo>> list(SysDeptParam param) {
        List<SysDept> list = sysDeptService.list(param);
        List<SysDeptVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysDeptVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysDept sysDept) {
        return ResultFactory.success(sysDeptService.save(sysDept));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysDept> get(String id) {
        return ResultFactory.success(sysDeptService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysDept sysDept) {
        return ResultFactory.success(sysDeptService.updateById(sysDept));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysDeptService.removeById(id));
    }

}