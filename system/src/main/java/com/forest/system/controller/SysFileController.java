package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysFile;
import com.forest.system.entity.param.SysFileParam;
import com.forest.system.entity.vo.SysFileVo;
import com.forest.system.service.ISysFileService;
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
 * 上传文件 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "上传文件控制层", tags = "上传文件控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-file")
public class SysFileController {
    @Resource
    public ISysFileService sysFileService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysFile>> listPage(SysFileParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysFile> list = sysFileService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysFileVo>> list(SysFileParam param) {
        List<SysFile> list = sysFileService.list(param);
        List<SysFileVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysFileVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysFile sysFile) {
        return ResultFactory.success(sysFileService.save(sysFile));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysFile> get(String id) {
        return ResultFactory.success(sysFileService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysFile sysFile) {
        return ResultFactory.success(sysFileService.updateById(sysFile));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysFileService.removeById(id));
    }

}