package ${cfg.parent}.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forest.core.base.TBaseRepositoryImpl;
import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${cfg.parent}.repository.${entity}Repository;
import ${cfg.parent}.entity.param.${entity}Param;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.ObjectUtil;

import javax.annotation.Resource;
import java.util.Date;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Repository
<#if kotlin>
open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName}  {

}
<#else>
public class ${entity}RepositoryImpl extends TBaseRepositoryImpl<${table.mapperName}, ${entity}> implements ${entity}Repository {
    @Resource
    ${table.mapperName} ${table.entityPath}Mapper;

    /**
    * 获取mapper
    */
    public ${table.mapperName} getMapper(){
        return ${table.entityPath}Mapper;
    };

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<${entity}> list(${entity}Param param) {
        return ${table.entityPath}Mapper.selectList(getWrapper(param));
    }

    /**
    * 列表查询条件
    * @param param
    * @return
    */
    private LambdaQueryWrapper<${entity}> getWrapper(${entity}Param param) {
    LambdaQueryWrapper<${entity}> wrapper = new LambdaQueryWrapper<>();
        if (ObjectUtil.isNotNull(param)) {
<#-- ----------  BEGIN 字段循环遍历  ---------->
    <#list table.fields as field>
        <#if field.name == "id">
            <#continue>
        </#if>
        <#if field.name == "create_by">
            <#continue>
        </#if>
        <#if field.name == "create_time">
            <#continue>
        </#if>
        <#if field.name == "update_by">
            <#continue>
        </#if>
        <#if field.name == "update_time">
            <#continue>
        </#if>
        <#if field.keyFlag>
            <#assign keyPropertyName="${field.propertyName}"/>
        </#if>

        <#if field.propertyType == 'LocalDateTime'  || field.propertyType == 'LocalDate'>
            if (ObjectUtil.isNotNull(param.get${field.propertyName?cap_first}StartTime())) {
                wrapper.ge(${entity}::get${field.propertyName?cap_first},param.get${field.propertyName?cap_first}StartTime());
            }
            if (ObjectUtil.isNotNull(param.get${field.propertyName?cap_first}EndTime())) {
                wrapper.le(${entity}::get${field.propertyName?cap_first},param.get${field.propertyName?cap_first}EndTime());
            }
        <#elseif field.propertyType == 'String'>
            // ${field.comment}
            if (StrUtil.isNotBlank(param.get${field.propertyName?cap_first}())) {
            wrapper.eq(${entity}::get${field.propertyName?cap_first}, param.get${field.propertyName?cap_first}());
            }
        <#else>
            // ${field.comment}
            if (ObjectUtil.isNotNull(param.get${field.propertyName?cap_first}())) {
            wrapper.eq(${entity}::get${field.propertyName?cap_first}, param.get${field.propertyName?cap_first}());
            }
        </#if>
    </#list>
<#------------  END 字段循环遍历  ---------->
            wrapper.orderByDesc(${entity}::getCreateTime);
        }
        return wrapper;
    }


}
</#if>