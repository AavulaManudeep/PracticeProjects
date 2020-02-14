/**
 * 
 */
package com.demo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author manu
 *
 */
public class SpringWebAppIntializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(MvcConfig.class);
		ServletRegistration.Dynamic dispatcherDynamic = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
		dispatcherDynamic.setLoadOnStartup(1);
		dispatcherDynamic.addMapping("/");
		
	}

}
