package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysUserPost;
import com.forest.system.entity.param.SysUserPostParam;
import com.forest.system.entity.vo.SysUserPostVo;
import com.forest.system.service.ISysUserPostService;
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
 * 用户与岗位关联表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "用户与岗位关联表控制层", tags = "用户与岗位关联表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-user-post")
public class SysUserPostController {
    @Resource
    public ISysUserPostService sysUserPostService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysUserPost>> listPage(SysUserPostParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysUserPost> list = sysUserPostService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysUserPostVo>> list(SysUserPostParam param) {
        List<SysUserPost> list = sysUserPostService.list(param);
        List<SysUserPostVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysUserPostVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysUserPost sysUserPost) {
        return ResultFactory.success(sysUserPostService.save(sysUserPost));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysUserPost> get(String id) {
        return ResultFactory.success(sysUserPostService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysUserPost sysUserPost) {
        return ResultFactory.success(sysUserPostService.updateById(sysUserPost));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysUserPostService.removeById(id));
    }

}