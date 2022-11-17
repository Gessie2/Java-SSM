package com.gjx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.gjx.controller","com.gjx.config"})
@EnableWebMvc
public class SpringMvcConfig {

}
