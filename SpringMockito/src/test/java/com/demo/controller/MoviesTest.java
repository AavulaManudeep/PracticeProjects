package com.demo.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.regex.Matcher;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.Module.SetupContext;

@RunWith(SpringRunner.class)
public class MoviesTest {

	
	private MockMvc mockmvc;
	
	@InjectMocks
	private Movies movies;
	
	@Before
	public void Setup() throws Exception
	{
		mockmvc = MockMvcBuilders.standaloneSetup(movies).build();
	}
	
	@Test
	public void testHello() throws Exception {
		
		mockmvc.perform(get("/test/hello")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Hello World"));
		
	}

	@Test
	public void testGetmovies() throws Exception {
		
		mockmvc.perform(get("/test/movies").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.moviename",org.hamcrest.Matchers.is("Spider Man")))
				.andExpect((ResultMatcher) jsonPath("$.banner", org.hamcrest.Matchers.is("Marvels")))
				.andExpect((ResultMatcher) jsonPath("$.rating", org.hamcrest.Matchers.is(4.4)));
	}

}
