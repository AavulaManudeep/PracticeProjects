/**
 * 
 */
package com.demo.Repositry;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Employee;

/**
 * @author manu
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
