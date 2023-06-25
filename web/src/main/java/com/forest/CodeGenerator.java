package com.forest;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * mybatis-plus 代码生成器
 * @apiNote
 */
@Slf4j
public class CodeGenerator {

    /**
     * 数据库地址
     */
    private final static String dbUrl = "jdbc:mysql://127.0.0.1:3306/spring_boot_fast_sys?characterEncoding=utf8&useSSL=true&serverTimezone=Asia/Shanghai&nullNamePatternMatchesAll=true";
    /**
     * 数据库驱动
     */
    private final static String dbDriveName = "com.mysql.jdbc.Driver";
    /**
     * 数据库用户
     */
    private final static String dbUserName = "root";
    /**
     * 数据库密码
     */
    private final static String dbPassWord = "123456";
    /**
     * 作者名
     */
    private final static String author = "zzl";
    /**
     * 模块名
     */
    private final static String modelName = "system";
    /**
     * 包名
     */
    private final static String parents = "com.forest."+modelName;
    /**
     * 输出目录
     */
    private final static String projectPath = System.getProperty("user.dir") + "/"+modelName+"/src/main/java";
    /**
     * mapper.xml 输出目录
     */
    private final static String xmlPath = System.getProperty("user.dir") + "/"+modelName+"/src/main/resources/mybatis";

    /**
     * 表名,多个表用 , 隔开 例如：(sys_menu,sys_category）
     */
    private final static String tableName = "sys_role_dept";

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 1、全局配置
        GlobalConfig globalConfig = new GlobalConfig(); //当前项目的路径
        globalConfig.setOutputDir(projectPath); //生成文件输出根目录
        globalConfig.setAuthor(author); // 作者名
        globalConfig.setOpen(false); // 是否打开文件夹
        globalConfig.setFileOverride(true); // 是否覆盖已有文件
        globalConfig.setSwagger2(true);
        mpg.setGlobalConfig(globalConfig);
        // 2、数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl(dbUrl);
        dataSourceConfig.setDriverName(dbDriveName);
        dataSourceConfig.setUsername(dbUserName);
        dataSourceConfig.setPassword(dbPassWord);
        mpg.setDataSource(dataSourceConfig);
        //3、包的配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(parents);
        pc.setEntity("entity.model");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        mpg.setPackageInfo(pc);
        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude(tableName.split(",")); // 需要生成的表 设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true); // 自动lombok；
        strategy.setCapitalMode(false);  //【不懂】 开启全局大写命名
        strategy.setSuperMapperClass("com.baomidou.mybatisplus.core.mapper.BaseMapper");
        strategy.setRestControllerStyle(true); // 控制：true——生成@RsetController false——生成@Controller
        strategy.setControllerMappingHyphenStyle(true); // 【不知道是啥】
        strategy.setEntityTableFieldAnnotationEnable(true); // 表字段注释启动 启动模板中的这个 <#if table.convert>
        strategy.setEntityBooleanColumnRemoveIsPrefix(true); // 是否删除实体类字段的前缀
        mpg.setStrategy(strategy);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map map= new HashMap();
                map.put("parent", parents);
                this.setMap(map);
            }
        };
        // 包名
        String parentPath = parents.replace(".","/");
        // xml模板位置
        String templatePath = "/template/mapperXml.ftl";
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return xmlPath + "/" + modelName
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        focList.add(new FileOutConfig("/template/vo.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名
                return projectPath +"/"+ parentPath
                        + "/entity/vo/" + tableInfo.getEntityName() + "Vo" + StringPool.DOT_JAVA;
            }
        });
        focList.add(new FileOutConfig("/template/param.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名
                return projectPath +"/"+ parentPath
                        + "/entity/param/" + tableInfo.getEntityName() + "Param" + StringPool.DOT_JAVA;
            }
        });
        focList.add(new FileOutConfig("/template/repository.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名
                return projectPath +"/"+ parentPath
                        + "/repository/" + tableInfo.getEntityName() + "Repository" + StringPool.DOT_JAVA;
            }
        });
        focList.add(new FileOutConfig("/template/repositoryImpl.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名
                return projectPath +"/"+ parentPath
                        + "/repository/impl/" + tableInfo.getEntityName() + "RepositoryImpl" + StringPool.DOT_JAVA;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        //模板生成器
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        TemplateConfig tc = new TemplateConfig();
        tc.setController("/template/controller");
        tc.setEntity("/template/model");
        tc.setMapper("/template/mapper");
        tc.setService("/template/service");
        tc.setServiceImpl("/template/serviceImpl");
//        tc.setController(null);
//        tc.setEntity(null);
//        tc.setMapper(null);
//        tc.setService(null);
//        tc.setServiceImpl(null);
        tc.setXml(null);
        mpg.setTemplate(tc);


        mpg.execute(); //执行

    }

}
