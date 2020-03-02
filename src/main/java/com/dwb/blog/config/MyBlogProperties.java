package com.dwb.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConfigurationProperties(prefix = "myblog",ignoreInvalidFields= true)
//@EnableConfigurationProperties(MyBlogProperties.class)
public class MyBlogProperties {
    @Value("${myblog.myBlogName}")
    public String myBlogName;
}
