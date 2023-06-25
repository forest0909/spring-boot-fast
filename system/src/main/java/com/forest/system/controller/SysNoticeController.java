package com.forest.system.controller;


import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import com.forest.core.common.util.DozerUtil;
import com.forest.core.common.vo.PageVo;
import com.forest.system.entity.model.SysNotice;
import com.forest.system.entity.param.SysNoticeParam;
import com.forest.system.entity.vo.SysNoticeVo;
import com.forest.system.service.ISysNoticeService;
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
 * 通知公告表 控制器
 * </p>
 *
 * @author zzl
 * @date 2023-06-25
 */

@Slf4j
@Api(value = "通知公告表控制层", tags = "通知公告表控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/sys-notice")
public class SysNoticeController {
    @Resource
    public ISysNoticeService sysNoticeService;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVo<SysNotice>> listPage(SysNoticeParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<SysNotice> list = sysNoticeService.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVo.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<SysNoticeVo>> list(SysNoticeParam param) {
        List<SysNotice> list = sysNoticeService.list(param);
        List<SysNoticeVo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, SysNoticeVo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody SysNotice sysNotice) {
        return ResultFactory.success(sysNoticeService.save(sysNotice));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<SysNotice> get(String id) {
        return ResultFactory.success(sysNoticeService.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody SysNotice sysNotice) {
        return ResultFactory.success(sysNoticeService.updateById(sysNotice));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(sysNoticeService.removeById(id));
    }

}