/**
 * 
 */
package com.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.repository.UserRepository;

/**
 * @author manu
 *
 */
@RestController
@RequestMapping("/rest/user")
public class HomeController {
	
	
	private UserRepository userRepository;

	public HomeController(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	@GetMapping("/add/{id}/{name}")
	@ResponseBody
	public User add(@PathVariable("id") final String id,@PathVariable("name") final String name)
	{
		userRepository.save(new User(id, name, 20000L));
		
		return userRepository.findById(id);
	}

	@GetMapping("/add/{id}/{name}")
	@ResponseBody
	public User update(@PathVariable("id") final String id,@PathVariable("name") final String name)
	{
		userRepository.update(new User(id, name, 20000L));
		
		return userRepository.findById(id);
	}

	@GetMapping("/all")
	@ResponseBody
	public Map<String, User> findAllUser()
	{
		//userRepository.save(new User(id, name, 20000L));
		
		return userRepository.findAll();
	}

}
