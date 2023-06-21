package ${package.Service};

import com.forest.core.base.TBaseService;
import ${package.Entity}.${entity};
import ${superServiceClassPackage};
import ${cfg.parent}.entity.vo.${entity}Vo;
import ${cfg.parent}.entity.param.${entity}Param;

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
public interface ${table.serviceName} extends TBaseService<${entity}>{
    /**
    * 列表查询
    * @param param
    * @return
    */
    List<${entity}> list(${entity}Param param);
}
</#if>