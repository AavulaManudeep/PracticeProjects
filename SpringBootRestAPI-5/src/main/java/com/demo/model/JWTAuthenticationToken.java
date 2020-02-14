/**
 * 
 */
package com.demo.model;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author manu
 *
 */
public class JWTAuthenticationToken extends UsernamePasswordAuthenticationToken{
	
	private String token;

	public JWTAuthenticationToken(String token) {
		super(null,null);
		this.token=token;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
