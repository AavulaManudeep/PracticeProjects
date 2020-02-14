/**
 * 
 */
package com.demo.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

/**
 * @author manu
 *
 */
@Data
@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@ManyToMany(mappedBy = "publishers")
	private Set<Book> books = new HashSet<Book>();
	
	public Publisher(String name)
	{
		this.name=name;
	}
}
