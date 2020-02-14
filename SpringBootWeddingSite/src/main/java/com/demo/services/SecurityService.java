/**
 * 
 */
package com.demo.services;

/**
 * @author manu
 *
 */
public interface SecurityService {
	
	String findloggedinusername();
	
	void autoLogin(String username, String password);

}
