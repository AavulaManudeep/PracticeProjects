/**
 * 
 */
package com.demo.controller;

import java.util.Date;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.ApiToken;

import com.demo.model.Client;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author manu
 *
 */
@RestController
@RequestMapping("/login")
public class HomeofControllers {

	
	@PostMapping
	public ResponseEntity<ApiToken> get(@RequestBody Client client)
	{
		return new ResponseEntity<>(new ApiToken(Jwts.builder().setSubject(client.getClientname()).claim("roles", "user")
				.setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "123@&*QMASDasdfi").compact()),HttpStatus.OK);
	}
}
