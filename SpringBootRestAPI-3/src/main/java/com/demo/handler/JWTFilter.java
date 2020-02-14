/**
 * 
 */
package com.demo.handler;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;

/**
 * @author manu
 *
 */
@Component
public class JWTFilter extends GenericFilterBean{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		final HttpServletRequest request = (HttpServletRequest) req;
		final String authorization = request.getHeader("authorization");
		
		if(authorization==null || !authorization.startsWith("Barer"))
		{
			throw new ServletException("401- Unauthorization");
		}
		try {
			final Claims claims = Jwts.parser().setSigningKey("123@&*QMASDasdfi").parseClaimsJws(authorization.substring(5)).getBody();
			request.setAttribute("Claims", claims);
			
		} catch (final SignatureException e) {
			// TODO: handle exception
			throw new ServletException("401- Unauthorization");
		}
		
		chain.doFilter(req, resp);
	}

}
