/**
 * 
 */
package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.User;

/**
 * @author manu
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
