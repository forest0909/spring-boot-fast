package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysRole;
import com.forest.system.entity.param.SysRoleParam;
import com.forest.system.entity.vo.SysRoleVo;
import com.forest.system.service.ISysRoleService;
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
 * 角色信息表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "角色信息表控制层", tags = "角色信息表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-role")
public class SysRoleController {
    @Resource
    public ISysRoleService sysRoleService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysRole>> listPage(SysRoleParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysRole> list = sysRoleService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysRoleVo>> list(SysRoleParam param) {
        List<SysRole> list = sysRoleService.list(param);
        List<SysRoleVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysRoleVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysRole sysRole) {
        return ResultFactory.success(sysRoleService.save(sysRole));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysRole> get(String id) {
        return ResultFactory.success(sysRoleService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysRole sysRole) {
        return ResultFactory.success(sysRoleService.updateById(sysRole));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysRoleService.removeById(id));
    }

}