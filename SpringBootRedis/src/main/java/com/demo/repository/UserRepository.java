/**
 * 
 */
package com.demo.repository;


import java.util.Map;

import org.springframework.stereotype.Service;

import com.demo.model.User;

/**
 * @author manu
 *
 */

public interface UserRepository {
	
	void save(User user);
	User findById(String id);
	Map<String,User> findAll();
	void update(User user);
	void delete (String id);
	

}
