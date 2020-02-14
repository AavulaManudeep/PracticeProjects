/**
 * 
 */
package com.demo.controllers;

import com.demo.pojo.Student;

/**
 * @author manu
 *
 */
public class StudentNotFoundException extends RuntimeException{
	
	public StudentNotFoundException()
	{
		
	}
	public StudentNotFoundException(Long studentid)
	{
		super("Student"+studentid+"not found");
	}
	
	
}
