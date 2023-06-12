package ${package.ServiceImpl};

import com.keepsoft.base.TBaseServiceImpl;
import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${cfg.parent}.repository.${entity}Repository;
import ${package.Service}.${table.serviceName};
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import javax.annotation.Resource;
import ${cfg.parent}.entity.vo.${entity}Vo;
import ${cfg.parent}.entity.param.${entity}Param;
import java.util.List;

/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service
<#if kotlin>
open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

}
<#else>
public class ${table.serviceImplName} extends TBaseServiceImpl<${entity}Repository,${entity}> implements ${table.serviceName} {
    @Resource
    ${entity}Repository ${table.entityPath}Repository;

    /**
    * 列表查询
    * @param param
    * @return
    */
    @Override
    public List<${entity}> list(${entity}Param param) {
        return ${table.entityPath}Repository.list(param);
    }
}
</#if>