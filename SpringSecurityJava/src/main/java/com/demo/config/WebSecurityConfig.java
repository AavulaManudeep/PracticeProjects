/**
 * 
 */
package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author manu
 *
 */
@EnableWebSecurity
@ComponentScan("com.demo.*")
public class WebSecurityConfig implements WebMvcConfigurer{
	
	@Bean
	public UserDetailsService userDetailsService()throws Exception{
		
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder().username("manu").password("1234").roles("USER").build());
		return manager;
		
	}
	protected void configure(HttpSecurity http)throws Exception {
		http
		.antMatcher("/")
		.authorizeRequests()
			.anyRequest().hasRole("USER")
			.and()
		.httpBasic();
		
	}

}
