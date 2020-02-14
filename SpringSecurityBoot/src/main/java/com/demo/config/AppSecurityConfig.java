/**
 * 
 */
package com.demo.config;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.demo.service.MyUserDetailsService;

/**
 * @author manu
 *
 */
@EnableWebSecurity
@Configuration
@ComponentScan("com.demo")
@ComponentScan("com.demo.config")
@ComponentScan("com.demo.controller")
@ComponentScan("com.demo.service")
@EntityScan("com.demo.dao")
@ComponentScan("com.demo.repository")
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private MyUserDetailsService userDetailsService;

	/*
	 * @Bean
	 * 
	 * @Override protected UserDetailsService userDetailsService() { // TODO
	 * Auto-generated method stub java.util.List<UserDetails> user= new
	 * ArrayList<UserDetails>();
	 * user.add(User.withDefaultPasswordEncoder().username("manu").password("1234").
	 * roles("USER").build());
	 * user.add(User.withDefaultPasswordEncoder().username("sai").password("1234").
	 * roles("ADMIN").build()); return new InMemoryUserDetailsManager(user); }
	 */

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception { //
	 * TODO Auto-generated method stub super.configure(http); }
	 */
	@Bean
	public AuthenticationProvider authProvider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}
	protected void configure(HttpSecurity http)throws Exception {
		http
		
		.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/user*").hasAnyRole("USER","ADMIN")
		.antMatchers("/admin*").access("hasRole('ADMIN')")
		.antMatchers("/**").access("hasRole('ADMIN')")
		.anyRequest().authenticated()
			.and().formLogin().loginPage("/login").permitAll()
			.and().logout().permitAll();
		http.csrf().disable();
		
	}
	 
	
	
}
