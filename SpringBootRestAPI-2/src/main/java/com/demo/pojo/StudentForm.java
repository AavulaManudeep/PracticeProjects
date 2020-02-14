/**
 * 
 */
package com.demo.pojo;

import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author manu
 *
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentForm {
	
	private String name;

}
