/**
 * 
 */
package com.demo.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.stereotype.Component;

import com.demo.model.JWTAuthenticationToken;

import io.jsonwebtoken.Header;

/**
 * @author manu
 *
 */
public class JWTAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {
	
	public JWTAuthenticationTokenFilter() {
		super("/rest/**");
		// TODO Auto-generated constructor stub
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException, IOException, ServletException {
		// TODO Auto-generated method stub
		
		    String header = request.getHeader("Authorization");
		    if (header==null || !header.startsWith("Manu ")) {
				
		    	throw new RuntimeException("Token is UnAuthorized");
			}
		  
	
		    JWTAuthenticationToken token = new JWTAuthenticationToken(header.substring(5));
		    
		
		return getAuthenticationManager().authenticate(token);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		// TODO Auto-generated method stub
		super.successfulAuthentication(request, response, chain, authResult);
		chain.doFilter(request, response);
	}

	

	
}
