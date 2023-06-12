package ${package.Controller};


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import ${package.Service}.${table.serviceName};
import ${package.Entity}.${entity};
import com.keepsoft.common.Result;
import com.keepsoft.common.ResultFactory;
import javax.annotation.Resource;
import com.keepsoft.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import com.keepsoft.util.DozerUtil;

import ${cfg.parent}.entity.vo.${entity}Vo;
import ${cfg.parent}.entity.param.${entity}Param;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * ${table.comment!} 控制器
 * </p>
 *
 * @author ${author}
 * @date ${date}
 */

@Slf4j
@Api(value = "${table.comment}控制层", tags = "${table.comment}控制层", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/${controllerMappingHyphen}")
    <#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
    <#else>
public class ${table.controllerName} {
    @Resource
    public ${table.serviceName} ${table.entityPath}Service;

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/listPage")
    public Result<PageVO<${entity}>> listPage(${entity}Param param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<${entity}> list = ${table.entityPath}Service.list(param);
        PageInfo pageInfo = new PageInfo(list);
        return ResultFactory.success(PageVO.build(pageInfo));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<${entity}Vo>> list(${entity}Param param) {
        List<${entity}> list = ${table.entityPath}Service.list(param);
        List<${entity}Vo> voList = new ArrayList<>();
        voList = DozerUtil.converterList(list, ${entity}Vo.class);
        return ResultFactory.success(voList);
    }

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody ${entity} ${table.entityPath}) {
        return ResultFactory.success(${table.entityPath}Service.save(${table.entityPath}));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/findDetailById")
    public Result<${entity}> get(String id) {
        return ResultFactory.success(${table.entityPath}Service.getById(id));
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/updateById")
    public Result update(@RequestBody ${entity} ${table.entityPath}) {
        return ResultFactory.success(${table.entityPath}Service.updateById(${table.entityPath}));
    }

    @ApiOperation(value = "根据id删除")
    @GetMapping("/deleteId")
    public Result delete(String id) {
        return ResultFactory.success(${table.entityPath}Service.removeById(id));
    }
    </#if>

}