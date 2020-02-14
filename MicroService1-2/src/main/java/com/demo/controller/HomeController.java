package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Movie;

@RestController
@RequestMapping("/movies")
public class HomeController {
	
	
	@GetMapping("/{movieid}")
	public Movie getMovie(@PathVariable("movieid") int movieid)
	{
		return new Movie(movieid, "Transformers");
	}

}
