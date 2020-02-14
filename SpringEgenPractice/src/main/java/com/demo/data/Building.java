package com.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "Building")
public class Building {

	
	@Id
	private String type;
	
	@Column
	private String name;
	
	@Column
	private int rooms;
	
	public Building() {
	
	}
	

}
