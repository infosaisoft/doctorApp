package com.harbor.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value= {ServiceConfig.class,AopConfig.class,PersistanceConfig.class      })

public class RootAppConfig {
public static void main(String[] args) {
SpringApplication.run(RootAppConfig.class, args);		
}		
}
