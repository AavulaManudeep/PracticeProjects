package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Rating;
import com.demo.model.UserRating;

@RestController
@RequestMapping("/moviecontroller")
public class MovieController {
	
	
	@ResponseBody
	@RequestMapping("/{movieid}")
	public UserRating getRating(@PathVariable("movieid") int movieid)
	{
		List<Rating> ratings = Arrays.asList(new Rating(54321, 4),new Rating(12345, 3));
		return new UserRating(ratings);
	}

}
