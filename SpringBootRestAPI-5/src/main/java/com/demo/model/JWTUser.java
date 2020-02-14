/**
 * 
 */
package com.demo.model;

/**
 * @author manu
 *
 */
public class JWTUser {

	public String getUsername() {
		return username;
	}

	public long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	private String username;
	private long id;
	private String role;

	public void setUsername(String subject) {
		// TODO Auto-generated method stub
		this.username = subject;
		
	}

	public void setId(long parseLong) {
		// TODO Auto-generated method stub
		
		this.id= parseLong;
		
	}

	public void setRole(String object) {
		// TODO Auto-generated method stub
		this.role= object;
		
	}
	

}
