/**
 * 
 */
package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author manu
 *
 */
@Configuration
@ComponentScan("com.demo.*")
public class MvcConfig {

	
	@Bean(name="viewResolver")
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	
}
