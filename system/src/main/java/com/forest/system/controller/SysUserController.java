package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysUser;
import com.forest.system.entity.param.SysUserParam;
import com.forest.system.entity.vo.SysUserVo;
import com.forest.system.service.ISysUserService;
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
 * 用户表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-21
 */

@Slf4j
@Api(value = "用户表控制层", tags = "用户表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Resource
    public ISysUserService sysUserService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysUser>> listPage(SysUserParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysUser> list = sysUserService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysUserVo>> list(SysUserParam param) {
        List<SysUser> list = sysUserService.list(param);
        List<SysUserVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysUserVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysUser sysUser) {
        return ResultFactory.success(sysUserService.save(sysUser));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysUser> get(String id) {
        return ResultFactory.success(sysUserService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysUser sysUser) {
        return ResultFactory.success(sysUserService.updateById(sysUser));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysUserService.removeById(id));
    }

}