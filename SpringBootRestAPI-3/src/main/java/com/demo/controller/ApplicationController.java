/**
 * 
 */
package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author manu
 *
 */
@RestController
@RequestMapping("/secured/app")
public class ApplicationController {
	
	@GetMapping
	public String VerifyApplicationAccess()
	{
		return "Welcome you are Secured";
	}

}
