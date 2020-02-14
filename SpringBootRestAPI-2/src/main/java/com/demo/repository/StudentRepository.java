/**
 * 
 */
package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.demo.pojo.Student;

/**
 * @author manu
 *
 */
@RepositoryRestResource(path = "students", collectionResourceRel = "students", itemResourceRel = "student")
public interface StudentRepository extends JpaRepository<Student, Long> {

}
