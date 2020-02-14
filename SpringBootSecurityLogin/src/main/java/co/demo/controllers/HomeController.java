/**
 * 
 */
package co.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.pojo.User;

/**
 * @author manu
 *
 */
@RestController
public class HomeController {
	
	@Autowired
	UserDetails userDetails;
	
	@GetMapping("/login")
	public String home()
	{
		User user = new User();
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("userdetails",user);
		
		return "Hello";
	}

	@PostMapping("/login")
	public ModelAndView homepage(@ModelAttribute("userdetails") User user)
	{
		ModelAndView modelandview = new ModelAndView();
		if(user.getUsername().equals("Manudeep") && user.getPassword().equals("Manudeep"))
		{
			modelandview.setViewName("home");
		}
		else {
			modelandview.setViewName("error");
		}
		
		return modelandview;
	}
}
