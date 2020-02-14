/**
 * 
 */
package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Role;

/**
 * @author manu
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	
}
