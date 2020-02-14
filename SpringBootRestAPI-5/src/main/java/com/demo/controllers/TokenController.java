/**
 * 
 */
package com.demo.controllers;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.JWTAuthenticationToken;
import com.demo.model.JWTUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


/**
 * @author manu
 *
 */
@RestController
@RequestMapping("/token")
public class TokenController {
	
	@PostMapping
	public ResponseEntity<JWTAuthenticationToken> tokengenerator(@RequestBody JWTUser user)
	{
		Claims claims = Jwts.claims().setSubject(user.getUsername());
		claims.put("role", user.getRole());
		claims.put("userId", String.valueOf(user.getId()));
		
		return new ResponseEntity<>(new JWTAuthenticationToken(Jwts.builder().setIssuer(user.getUsername()).setClaims(claims)
																.setIssuedAt(new Date()).setAudience(user.getRole()).setId(null).signWith(SignatureAlgorithm.HS256, "youtube")
																.compact()),HttpStatus.OK);
	}

}
