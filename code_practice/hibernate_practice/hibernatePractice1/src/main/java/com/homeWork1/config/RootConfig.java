package com.homeWork1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(DbConfig.class)
@Configuration
public class RootConfig {

}