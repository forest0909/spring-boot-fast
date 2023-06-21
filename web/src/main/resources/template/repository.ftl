package ${cfg.parent}.repository;

import com.forest.core.base.TBaseRepository;
import ${package.Entity}.${entity};
import ${cfg.parent}.entity.param.${entity}Param;
import ${package.Mapper}.${table.mapperName};

import java.util.List;

/**
 * <p>
 * ${table.comment!} 服务类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if kotlin>
    interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
public interface ${entity}Repository extends TBaseRepository<${entity}>{

    /**
    * 列表查询
    * @param param
    * @return
    */
    List<${entity}> list(${entity}Param param);

    /**
    * 获取mapper
    */
    ${table.mapperName} getMapper();

}
</#if>