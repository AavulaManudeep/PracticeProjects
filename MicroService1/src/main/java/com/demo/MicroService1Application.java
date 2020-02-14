package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
@ComponentScan("com.demo.*")
public class MicroService1Application {
	
	@Bean
	@LoadBalanced
	public RestTemplate geTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean 
	public WebClient.Builder getClient()
	{
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroService1Application.class, args);
	}

}
