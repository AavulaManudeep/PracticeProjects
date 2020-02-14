/**
 * 
 */
package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author manu
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private String username;
	
	private String password;
}
