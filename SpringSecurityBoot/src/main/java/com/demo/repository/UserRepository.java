/**
 * 
 */
package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.demo.dao.User;

/**
 * @author manu
 *
 */

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
