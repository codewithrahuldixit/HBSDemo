package com.rahul.SpringWebDeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.SpringWebDeb.StudentService;
import com.rahul.SpringWebDeb.model.Student;

@RestController
public class RestControllerDemo {

	@Autowired
	private StudentService service;
	@GetMapping("/sayHello")
	public String Hello() {
		return "Hello World!!!!!!!!!!!!!!!!";
	}
	@GetMapping("/students")
	public List<Student> getAll() {
		return service.getAllStudents();
	}
	@PostMapping("/students")
	public void storeStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	@GetMapping("/students/{id}")
	public Student getByStudentID(@PathVariable int id) {
		
		return service.getById(id);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteByStudentID(@PathVariable int id) {
		
		service.deleteById(id);
	}
}
