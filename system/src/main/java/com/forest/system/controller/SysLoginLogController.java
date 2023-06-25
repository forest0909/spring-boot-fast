package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysLoginLog;
import com.forest.system.entity.param.SysLoginLogParam;
import com.forest.system.entity.vo.SysLoginLogVo;
import com.forest.system.service.ISysLoginLogService;
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
 * 系统访问记录 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "系统访问记录控制层", tags = "系统访问记录控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-login-log")
public class SysLoginLogController {
    @Resource
    public ISysLoginLogService sysLoginLogService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysLoginLog>> listPage(SysLoginLogParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysLoginLog> list = sysLoginLogService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysLoginLogVo>> list(SysLoginLogParam param) {
        List<SysLoginLog> list = sysLoginLogService.list(param);
        List<SysLoginLogVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysLoginLogVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysLoginLog sysLoginLog) {
        return ResultFactory.success(sysLoginLogService.save(sysLoginLog));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysLoginLog> get(String id) {
        return ResultFactory.success(sysLoginLogService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysLoginLog sysLoginLog) {
        return ResultFactory.success(sysLoginLogService.updateById(sysLoginLog));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysLoginLogService.removeById(id));
    }

}