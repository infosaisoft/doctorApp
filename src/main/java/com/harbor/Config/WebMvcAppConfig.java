package com.harbor.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.harbor.controller","com.harbor.validator"})
public class WebMvcAppConfig {

}
