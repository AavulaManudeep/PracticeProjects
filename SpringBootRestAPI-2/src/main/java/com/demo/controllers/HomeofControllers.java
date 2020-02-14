/**
 * 
 */
package com.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

import com.demo.pojo.Student;
import com.demo.pojo.StudentForm;
import com.demo.repository.StudentRepository;

/**
 * @author manu
 *
 */
@RestController
@RequestMapping("/st1/students")
public class HomeofControllers {
	
	private StudentRepository studentRepository;
	
	public HomeofControllers(StudentRepository studentRepository) {
		// TODO Auto-generated constructor stub
		this.studentRepository=studentRepository;
	}
	

    @GetMapping("")
    public ResponseEntity all() {
        return ok(studentRepository.findAll());
    }
    
    @PostMapping("")
    public ResponseEntity save(@RequestBody StudentForm form , HttpServletRequest request)
    {
    	Student saved = this.studentRepository.save(Student.builder().name(form.getName()).build());
    	return created(
    			ServletUriComponentsBuilder
    				.fromContextPath(request)
    				.path("/st1/students/{id}")
    				.buildAndExpand(saved.getId())
    				.toUri())
    			.build();
    			
    			
    }
    
    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        return ok(this.studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException()));
    }


    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody StudentForm form) {
        Student existed = this.studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException());
        existed.setName(form.getName());

        this.studentRepository.save(existed);
        return noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        Student existed = this.studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException());
        this.studentRepository.delete(existed);
        return noContent().build();
    }
}