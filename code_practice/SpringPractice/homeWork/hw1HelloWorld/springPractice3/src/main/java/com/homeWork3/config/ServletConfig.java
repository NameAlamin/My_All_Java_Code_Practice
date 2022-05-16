package com.homeWork3.config;

import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ServletConfig implements WebMvcConfigurer {
    public void configViewResolver(ViewResolverRegistry registry){
        registry.jsp("/WEB-INF/views",".jsp");
    }
}
