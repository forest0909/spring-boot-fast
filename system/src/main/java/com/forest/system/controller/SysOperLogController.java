package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysOperLog;
import com.forest.system.entity.param.SysOperLogParam;
import com.forest.system.entity.vo.SysOperLogVo;
import com.forest.system.service.ISysOperLogService;
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
 * 操作日志记录 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "操作日志记录控制层", tags = "操作日志记录控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-oper-log")
public class SysOperLogController {
    @Resource
    public ISysOperLogService sysOperLogService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysOperLog>> listPage(SysOperLogParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysOperLog> list = sysOperLogService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysOperLogVo>> list(SysOperLogParam param) {
        List<SysOperLog> list = sysOperLogService.list(param);
        List<SysOperLogVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysOperLogVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysOperLog sysOperLog) {
        return ResultFactory.success(sysOperLogService.save(sysOperLog));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysOperLog> get(String id) {
        return ResultFactory.success(sysOperLogService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysOperLog sysOperLog) {
        return ResultFactory.success(sysOperLogService.updateById(sysOperLog));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysOperLogService.removeById(id));
    }

}