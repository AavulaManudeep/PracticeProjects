/**
 * 
 */
package com.demo.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author manu
 *
 */
@Entity
public class Employee  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String firstname;
	
	private String lastname;
	
	private String phonenumber;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstname, String lastname, String phonenumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
	}
	public long getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString()
	{
		return "[id:"+id +"firstname:"+firstname+"lastname:"+lastname+"phonenumber:"+phonenumber+"]";
		
	}

}
