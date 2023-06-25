package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysUserRole;
import com.forest.system.entity.param.SysUserRoleParam;
import com.forest.system.entity.vo.SysUserRoleVo;
import com.forest.system.service.ISysUserRoleService;
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
 * 用户和角色关联表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "用户和角色关联表控制层", tags = "用户和角色关联表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-user-role")
public class SysUserRoleController {
    @Resource
    public ISysUserRoleService sysUserRoleService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysUserRole>> listPage(SysUserRoleParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysUserRole> list = sysUserRoleService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysUserRoleVo>> list(SysUserRoleParam param) {
        List<SysUserRole> list = sysUserRoleService.list(param);
        List<SysUserRoleVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysUserRoleVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysUserRole sysUserRole) {
        return ResultFactory.success(sysUserRoleService.save(sysUserRole));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysUserRole> get(String id) {
        return ResultFactory.success(sysUserRoleService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysUserRole sysUserRole) {
        return ResultFactory.success(sysUserRoleService.updateById(sysUserRole));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysUserRoleService.removeById(id));
    }

}