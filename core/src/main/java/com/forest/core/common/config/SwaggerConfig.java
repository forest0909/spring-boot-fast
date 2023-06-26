package com.forest.core.common.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置类
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.OAS_30)
                .groupName("all")
                .apiInfo(apiInfo()).enable(true)
                .select()
                //apis： 添加swagger接口提取范围
                .apis(RequestHandlerSelectors.basePackage("com"))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * 配置swagger的Docket bean
     * @return
     */
    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.OAS_30)  // 指定swagger3.0版本
                .groupName("system")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.forest.system"))  // 指定扫描的包  常用方式
                .build()
                .apiInfo(apiInfo());
    }
    @Bean
    public Docket docket3() {
        return new Docket(DocumentationType.OAS_30)  // 指定swagger3.0版本
                .groupName("business")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.forest.business"))  // 指定扫描的包  常用方式
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("spring_boot_fast接口文档")
                .description("基于springboot的快速开发框架")
                .contact(new Contact("forest", "https://github.com/forest0909/spring-boot-fast", "316196207@qq.com"))
                .version("1.0")
                .build();
    }
}
