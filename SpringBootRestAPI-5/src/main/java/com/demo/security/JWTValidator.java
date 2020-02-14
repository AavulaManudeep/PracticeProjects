package com.demo.security;

import org.springframework.stereotype.Component;

import com.demo.model.JWTUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JWTValidator {

	public JWTUser validate(String token) {
		
		JWTUser jwtuser =null;
		
		try {
		Claims bodyClaims = Jwts.parser().setSigningKey("youtube").parseClaimsJws(token).getBody();
		
		 jwtuser = new JWTUser();
		
		jwtuser.setUsername(bodyClaims.getSubject());
		jwtuser.setId(Long.parseLong((String) bodyClaims.get("userId")));
		jwtuser.setRole((String)bodyClaims.get("role"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return jwtuser;
		// TODO Auto-generated method stub
		
	}
	
	

}
