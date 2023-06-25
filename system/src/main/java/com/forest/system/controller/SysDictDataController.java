package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysDictData;
import com.forest.system.entity.param.SysDictDataParam;
import com.forest.system.entity.vo.SysDictDataVo;
import com.forest.system.service.ISysDictDataService;
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
 * 字典数据表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "字典数据表控制层", tags = "字典数据表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-dict-data")
public class SysDictDataController {
    @Resource
    public ISysDictDataService sysDictDataService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysDictData>> listPage(SysDictDataParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysDictData> list = sysDictDataService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysDictDataVo>> list(SysDictDataParam param) {
        List<SysDictData> list = sysDictDataService.list(param);
        List<SysDictDataVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysDictDataVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysDictData sysDictData) {
        return ResultFactory.success(sysDictDataService.save(sysDictData));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysDictData> get(String id) {
        return ResultFactory.success(sysDictDataService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysDictData sysDictData) {
        return ResultFactory.success(sysDictDataService.updateById(sysDictData));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysDictDataService.removeById(id));
    }

}