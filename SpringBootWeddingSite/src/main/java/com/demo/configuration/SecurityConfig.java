/**
 * 
 */
package com.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author manu
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Override
	protected void configure(HttpSecurity httpSecurity)throws Exception
	{
		httpSecurity.
					authorizeRequests().antMatchers("/").permitAll()
					.antMatchers("/user/*").hasAnyRole("USER","ADMIN")
					.antMatchers("/admin/*").hasAnyRole("ADMIN")
					.anyRequest().authenticated().and().formLogin().permitAll()
					.and().logout().permitAll();
		
			
	}
}
