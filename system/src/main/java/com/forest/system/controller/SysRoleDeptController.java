package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysRoleDept;
import com.forest.system.entity.param.SysRoleDeptParam;
import com.forest.system.entity.vo.SysRoleDeptVo;
import com.forest.system.service.ISysRoleDeptService;
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
 * 角色和部门关联表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "角色和部门关联表控制层", tags = "角色和部门关联表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-role-dept")
public class SysRoleDeptController {
    @Resource
    public ISysRoleDeptService sysRoleDeptService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysRoleDept>> listPage(SysRoleDeptParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysRoleDept> list = sysRoleDeptService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysRoleDeptVo>> list(SysRoleDeptParam param) {
        List<SysRoleDept> list = sysRoleDeptService.list(param);
        List<SysRoleDeptVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysRoleDeptVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysRoleDept sysRoleDept) {
        return ResultFactory.success(sysRoleDeptService.save(sysRoleDept));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysRoleDept> get(String id) {
        return ResultFactory.success(sysRoleDeptService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysRoleDept sysRoleDept) {
        return ResultFactory.success(sysRoleDeptService.updateById(sysRoleDept));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysRoleDeptService.removeById(id));
    }

}