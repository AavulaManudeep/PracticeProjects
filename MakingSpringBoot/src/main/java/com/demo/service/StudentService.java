/**
 * 
 */
package com.demo.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.pojo.User;

/**
 * @author manu
 *
 */
@Repository
public interface StudentService extends CrudRepository<User, Long>{

}
