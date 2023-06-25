package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysDict;
import com.forest.system.entity.param.SysDictParam;
import com.forest.system.entity.vo.SysDictVo;
import com.forest.system.service.ISysDictService;
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
 * 字典类型表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "字典类型表控制层", tags = "字典类型表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-dict")
public class SysDictController {
    @Resource
    public ISysDictService sysDictService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysDict>> listPage(SysDictParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysDict> list = sysDictService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysDictVo>> list(SysDictParam param) {
        List<SysDict> list = sysDictService.list(param);
        List<SysDictVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysDictVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysDict sysDict) {
        return ResultFactory.success(sysDictService.save(sysDict));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysDict> get(String id) {
        return ResultFactory.success(sysDictService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysDict sysDict) {
        return ResultFactory.success(sysDictService.updateById(sysDict));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysDictService.removeById(id));
    }

}