/**
 * 
 */
package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author manu
 *
 */
@Data
@AllArgsConstructor
@Entity(name="MicroservicesStudent")
public class Strudent {
	
	@Id
	private Long id;
	@Column
	private String name;
	
	public Strudent()
	{
		
	}
	

}
