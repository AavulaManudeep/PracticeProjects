package com.demo.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.demo.model.CatalogItem;
import com.demo.model.Movie;
import com.demo.model.Rating;
import com.demo.model.UserRating;

@RestController
public class HomeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder builder ;
	
	@ResponseBody
	@RequestMapping("/moviecatlog/{userid}")
	public List<CatalogItem> getCatalogItems(@PathVariable("userid") int userid)
	{
		UserRating ratings = restTemplate.getForObject("http://movie-info/moviecontroller/"+ userid, UserRating.class);
		
		return ratings.getRatings().stream().map(rating-> {
			Movie movies = restTemplate.getForObject("http://movies/movies/"+ rating.getMovieId(), Movie.class);
			return  new CatalogItem(movies.getName(),"This Movie is about Sic-Fic",rating.getRating());
			
		}).collect(Collectors.toList());
	}

}
