package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.*")
public class SpringBootRestApi5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApi5Application.class, args);
	}

}
