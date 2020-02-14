/**
 * 
 */
package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.dao.User;
import com.demo.repository.UserPrinciple;
import com.demo.repository.UserRepository;

/**
 * @author manu
 *
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired(required=false)
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repo.findByUsername(username);
		
		if(user==null)
		{
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%>>>>>>>>>>>>>>>>>");
			throw new UsernameNotFoundException("User 404");
		}
		return new UserPrinciple(user);
	}

}
