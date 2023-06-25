package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysPost;
import com.forest.system.entity.param.SysPostParam;
import com.forest.system.entity.vo.SysPostVo;
import com.forest.system.service.ISysPostService;
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
 * 岗位信息表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "岗位信息表控制层", tags = "岗位信息表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-post")
public class SysPostController {
    @Resource
    public ISysPostService sysPostService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysPost>> listPage(SysPostParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysPost> list = sysPostService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysPostVo>> list(SysPostParam param) {
        List<SysPost> list = sysPostService.list(param);
        List<SysPostVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysPostVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysPost sysPost) {
        return ResultFactory.success(sysPostService.save(sysPost));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysPost> get(String id) {
        return ResultFactory.success(sysPostService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysPost sysPost) {
        return ResultFactory.success(sysPostService.updateById(sysPost));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysPostService.removeById(id));
    }

}