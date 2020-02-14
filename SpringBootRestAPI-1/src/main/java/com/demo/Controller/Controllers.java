/**
 * 
 */
package com.demo.Controller;

import java.util.List;

import javax.persistence.Id;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.DAO.EmployeeService;
import com.demo.Repositry.EmployeeRepository;
import com.demo.pojo.Employee;

/**
 * @author manu
 *
 */
@RestController
public class Controllers {
	
	@Autowired
	EmployeeService employeeservice;
	
	@RequestMapping("/")
	public ModelAndView home(Model model)
	{
		Employee employee = new Employee();
		model.addAttribute("Employee",employee);
		ModelAndView modelandview= new ModelAndView("home");
		
		return modelandview;
	}
	
	@PostMapping("/addEmployee")
	public ModelAndView save(@ModelAttribute("Employee") Employee employee)
	{
		employeeservice.save(employee);
		ModelAndView modelandview= new ModelAndView("save");
		return modelandview;
	}
	
	@GetMapping("/updateEmployee/{id}")
	public ModelAndView update(@PathVariable(value="id") Long id)
	{
		Employee employee = employeeservice.singleEmployee(id);
		ModelAndView modelandview = new ModelAndView();
		if(employee == null)
		{
			modelandview.setViewName("error");
		}
		else {
			
			employee.setFirstname("Manu");
			employeeservice.save(employee);
			
			modelandview.setViewName("Update");
		}
	
		return modelandview;
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public ModelAndView delete(@PathVariable(value="id") Long id )
	{
		ModelAndView modelandview= new ModelAndView();
		Employee employee =employeeservice.singleEmployee(id);
		if(employee ==null)
		{
			
			modelandview.setViewName("error");
		}
		else {
			employeeservice.delete(id);
			modelandview.setViewName("delete");
		}
		return modelandview;
	}
	
	@GetMapping("/getEmployees")
	@ResponseBody
	public List<Employee> getall()
	{
		return employeeservice.allEmployees();
	}
	
	@GetMapping("/getone/{id}")
	@ResponseBody
	public Employee getOne(@PathVariable(value="id") Long id)
	{
		return employeeservice.singleEmployee(id);
	}

}
