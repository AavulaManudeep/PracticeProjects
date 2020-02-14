/**
 * 
 */
package com.demo.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Movie;

/**
 * @author manu
 *
 */
@RestController
@RequestMapping("/test")
public class Movies {

	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World";
	}
	
	@GetMapping(value = "/movies",produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Movie getmovies()
	{
		return new Movie("Spider Man","Marvels",4.4);
	}

}
