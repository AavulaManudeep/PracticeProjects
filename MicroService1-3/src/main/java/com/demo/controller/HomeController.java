package com.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Strudent;
import com.demo.repository.StudentRepository;

@RestController
@RequestMapping("/testing")
public class HomeController {
	
	
	@Autowired
	private StudentRepository studentrepository;
	
	@ResponseBody
	@RequestMapping("/output/{id}")
	public String body(@PathVariable("id") int id)
	{
		
		return "Output"+id;
	}
	
	@GetMapping("/registrationform")
	public ModelAndView registrationform(Model model)
	{
		Strudent student = new Strudent();
		ModelAndView modelAndView = new ModelAndView("register");
		model.addAttribute("student",student);
		return modelAndView;
		
		
	}
	@ResponseBody
	@PostMapping("/registration")
	public String register(@ModelAttribute("student") Strudent student)
	{
		studentrepository.save(student);
		return "Sucess";
		
	}
	@ResponseBody
	@GetMapping("/student/{id}")
	public String getstudentinfo(@PathVariable("id") long id)
	{
		return studentrepository.findById(id).toString();
	}
	
	

}
