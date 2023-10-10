package com.web.sectionb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.web.sectionb.model.Student;
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
		return  service.getById(id);
	}
}
