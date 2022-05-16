package com.homeWork2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.homeWork2.controllers"})
public class ServletConfig implements WebMvcConfigurer {
    public void configureViewResolver(ViewResolverRegistry registry){
        registry.jsp("/WEB-INF/views",".jsp");
    }
}
