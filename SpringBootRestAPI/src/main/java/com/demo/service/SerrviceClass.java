/**
 * 
 */
package com.demo.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.dao.Student;

/**
 * @author manu
 *
 */
@Repository
public interface SerrviceClass extends CrudRepository<Student, Long> {

	

}
