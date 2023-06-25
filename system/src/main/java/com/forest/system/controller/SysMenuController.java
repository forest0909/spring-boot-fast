package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysMenu;
import com.forest.system.entity.param.SysMenuParam;
import com.forest.system.entity.vo.SysMenuVo;
import com.forest.system.service.ISysMenuService;
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
 * 菜单权限表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "菜单权限表控制层", tags = "菜单权限表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-menu")
public class SysMenuController {
    @Resource
    public ISysMenuService sysMenuService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysMenu>> listPage(SysMenuParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysMenu> list = sysMenuService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysMenuVo>> list(SysMenuParam param) {
        List<SysMenu> list = sysMenuService.list(param);
        List<SysMenuVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysMenuVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysMenu sysMenu) {
        return ResultFactory.success(sysMenuService.save(sysMenu));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysMenu> get(String id) {
        return ResultFactory.success(sysMenuService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysMenu sysMenu) {
        return ResultFactory.success(sysMenuService.updateById(sysMenu));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysMenuService.removeById(id));
    }

}