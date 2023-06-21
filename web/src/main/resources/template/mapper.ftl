package ${package.Mapper};

import ${package.Entity}.${entity};
import com.forest.core.base.TBaseMapper;

/**
 * <p>
 * ${table.comment!} Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
<#if kotlin>
    interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
public interface ${table.mapperName} extends TBaseMapper<${entity}> {

}
</#if>