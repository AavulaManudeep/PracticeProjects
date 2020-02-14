package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.*")
@EnableAutoConfiguration
public class SpringBootRestApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApi1Application.class, args);
	}

}
