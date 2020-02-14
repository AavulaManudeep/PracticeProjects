/**
 * 
 */
package com.demo.DAO;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.Repositry.EmployeeRepository;
import com.demo.pojo.Employee;

/**
 * @author manu
 *
 */
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> allEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee singleEmployee(long empid)
	{
		return employeeRepository.getOne(empid);
	}
	
	public Employee save(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	public void delete(Long empid)
	{
		employeeRepository.deleteById(empid);
	}
	
	
}
