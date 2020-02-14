package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.demo")
@ComponentScan("com.demo.config")
@ComponentScan("com.demo.controller")
@ComponentScan("com.demo.service")
@EntityScan("com.demo.dao")
@ComponentScan("com.demo.repository")
public class SpringSecurityBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBootApplication.class, args);
	}

}
