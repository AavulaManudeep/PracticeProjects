/**
 * 
 */
package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author manu
 *
 */
@Controller
public class HomeController {

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String hello()
	{
		return "home";
	}
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String welcome()
	{
		return "private";
	}
}
