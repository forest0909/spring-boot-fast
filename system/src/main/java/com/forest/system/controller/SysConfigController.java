package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysConfig;
import com.forest.system.entity.param.SysConfigParam;
import com.forest.system.entity.vo.SysConfigVo;
import com.forest.system.service.ISysConfigService;
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
 * 参数配置表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "参数配置表控制层", tags = "参数配置表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-config")
public class SysConfigController {
    @Resource
    public ISysConfigService sysConfigService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysConfig>> listPage(SysConfigParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysConfig> list = sysConfigService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysConfigVo>> list(SysConfigParam param) {
        List<SysConfig> list = sysConfigService.list(param);
        List<SysConfigVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysConfigVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysConfig sysConfig) {
        return ResultFactory.success(sysConfigService.save(sysConfig));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysConfig> get(String id) {
        return ResultFactory.success(sysConfigService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysConfig sysConfig) {
        return ResultFactory.success(sysConfigService.updateById(sysConfig));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysConfigService.removeById(id));
    }

}