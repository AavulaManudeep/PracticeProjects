/**
 * 
 */
package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.dao.Student;
import com.demo.service.SerrviceClass;

/**
 * @author manu
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	private SerrviceClass serviceclass;
	
	@RequestMapping("/")
	public ModelAndView home(Model model)
	{
		Student student= new Student();
		model.addAttribute("students",student);
		ModelAndView modelandview= new ModelAndView("home");
		
		return modelandview;
	}
	
	@PostMapping("save")
    public ModelAndView save(@ModelAttribute("students") Student student)
    {	
    	serviceclass.save(student);
    	System.out.println(student);
    	return new ModelAndView("save");
    }
	

}
