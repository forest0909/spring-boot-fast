package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysRoleMenu;
import com.forest.system.entity.param.SysRoleMenuParam;
import com.forest.system.entity.vo.SysRoleMenuVo;
import com.forest.system.service.ISysRoleMenuService;
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
 * 角色和菜单关联表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "角色和菜单关联表控制层", tags = "角色和菜单关联表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-role-menu")
public class SysRoleMenuController {
    @Resource
    public ISysRoleMenuService sysRoleMenuService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysRoleMenu>> listPage(SysRoleMenuParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysRoleMenu> list = sysRoleMenuService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysRoleMenuVo>> list(SysRoleMenuParam param) {
        List<SysRoleMenu> list = sysRoleMenuService.list(param);
        List<SysRoleMenuVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysRoleMenuVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysRoleMenu sysRoleMenu) {
        return ResultFactory.success(sysRoleMenuService.save(sysRoleMenu));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysRoleMenu> get(String id) {
        return ResultFactory.success(sysRoleMenuService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysRoleMenu sysRoleMenu) {
        return ResultFactory.success(sysRoleMenuService.updateById(sysRoleMenu));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysRoleMenuService.removeById(id));
    }

}