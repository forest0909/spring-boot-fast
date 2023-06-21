package com.forest.core.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzl
 * @version 1.0
 * ClassName：MyBatisPlusConfig
 * Date：2023/6/21
 * Description：
 */
@Configuration
@MapperScan(value={"com.forest.**.mapper"})
public class MyBatisPlusConfig {
}
