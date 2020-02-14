/**
 * 
 */
package com.demo.main;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Comparator;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author manu
 *
 */

public class Student implements Comparable<Student>{

	/**
	 * 
	 */
	private String name;
	private Integer id;
	private String major;
	private String emailid;
	
	public Student(String name, Integer id, String major, String emailid) {
		super();
		this.name = name;
		this.id = id;
		this.major = major;
		this.emailid = emailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", major=" + major + ", emailid=" + emailid + "]";
	}

	public static Comparator<Student> namecomparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
		
	};
	
	public static Comparator<Student> majorcomparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getMajor().compareTo(o2.getMajor());
		}
		
		
	};
	
	public static Comparator<Student> emailidcomparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getEmailid().compareTo(o2.getEmailid());
		}
		
		
	};


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getId()-o.getId();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailid == null) ? 0 : emailid.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	
	

}
