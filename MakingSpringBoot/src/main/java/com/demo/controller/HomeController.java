/**
 * 
 */
package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

import com.demo.pojo.User;
import com.demo.service.StudentService;

/**
 * @author manu
 *
 */
@Controller
public class HomeController {
	@Autowired
	private StudentService student;
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Hey Iam Here");
		return "home";
	}
	
	@RequestMapping(value = "/saveuser",method = RequestMethod.POST)
	public String SaveUser(User user)
	{
		User user2 = student.save(user);
		System.out.println(user2.getMajor());
		return "home";
	}

}
