package com.unnab.jpa2.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="com.unnab.jpa2")
@EntityScan(basePackages="com.unnab.jpa2.entity")
@EnableWebMvc
public class Application {
	public static void main(String... args){
		SpringApplication.run(Application.class, args);
	}
}
