package com.whu.cs.nuclear.platform.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * @author: pele
 * @time: 2019/3/23 16:16
 * @project: nuclear-security-info-platform
 * @description:
 */
@Configuration
@ComponentScan("com.whu.cs.nuclear.platform.controller")
public class WebConfig {
}
