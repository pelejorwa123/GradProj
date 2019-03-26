package com.whu.cs.nuclear.platform.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: pele
 * @time: 2019/3/23 16:21
 * @project: nuclear-security-info-platform
 * @description:
 */
@Configuration
@ComponentScan(basePackages = {"com.whu.cs.nuclear.platform.service"})
@MapperScan(basePackages = {"com.whu.cs.nuclear.platform.mapper"})
public class SpringConfig {
}
