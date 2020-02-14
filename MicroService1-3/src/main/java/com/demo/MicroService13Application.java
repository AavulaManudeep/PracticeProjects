package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.*")
public class MicroService13Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroService13Application.class, args);
	}

}
