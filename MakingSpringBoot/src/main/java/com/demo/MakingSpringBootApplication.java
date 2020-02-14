package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
//import org.springframework.context.annotation.ComponentScans;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.demo.controller")
  @EntityScan("com.demo.pojo")
  
 @EnableJdbcRepositories("com.demo.service")
public class MakingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakingSpringBootApplication.class, args);
	}

}
