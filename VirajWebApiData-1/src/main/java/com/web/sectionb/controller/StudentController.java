package com.web.sectionb.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.sectionb.model.Student;
import com.web.sectionb.model.UserNotFoundException;
import com.web.sectionb.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to My First Controller";
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return  service.getAll();
	}
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		Student student;
		try {
		student =  service.getById(id);
		 }
		catch(NoSuchElementException exception) {
			throw new UserNotFoundException("User Not Found");
		}
		return student;
		 
	}
	@DeleteMapping("/students/{id}")
	public void deleteStudentById(@PathVariable int id) {
	 service.deleteById(id);
	}
	@PostMapping("/students")
	public ResponseEntity<Student> storeStudent(@RequestBody Student student) {
		
		return service.save(student);
		
	}
}
