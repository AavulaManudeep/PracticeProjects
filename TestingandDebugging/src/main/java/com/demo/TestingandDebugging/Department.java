/**
 * 
 */
package com.demo.TestingandDebugging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author manu
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor

public class Department extends Student{
	
	private String department;
	
	public Department(String department,int id,String fname,String lastname)
	{
		super(id,fname,lastname);
		this.department=department;
	}
	

}
