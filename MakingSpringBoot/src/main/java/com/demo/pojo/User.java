/**
 * 
 */
package com.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author manu
 *
 */
@Entity
public class User {
	@Id
	public long studentid;
	
	public String name;
	
	public String major;

	public User() {
		super();
	}

	public User(long studentid, String name, String major) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.major = major;
	}

	public long getStudentid() {
		return studentid;
	}

	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	 
	
	

}
