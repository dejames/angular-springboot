package com.lets.veglife.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.lets.veglife")
public class SpringRootConfig {
    public static void main(String[] args) {
        SpringApplication.run(SpringRootConfig.class, args);
    }
}
