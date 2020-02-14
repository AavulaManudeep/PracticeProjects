/**
 * 
 */
package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author manu
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return"home";
	}
	@RequestMapping("/admin")
	public String adminView()
	{
		return "admin";
	}
	@RequestMapping("/user")
	public String userView()
	{
		return "user";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }

}
