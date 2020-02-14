/**
 * 
 */
package com.demo.services;

import com.demo.model.User;

/**
 * @author manu
 *
 */
public interface UserService {
	
	void save(User user);
	
	User findByUsername(String username);

}
