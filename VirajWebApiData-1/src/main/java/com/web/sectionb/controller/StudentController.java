package com.web.sectionb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.sectionb.model.Student;
import com.web.sectionb.service.StudentSerice;

@RestController
public class StudentController {

	@Autowired
	private StudentSerice service;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to My First Controller";
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return  service.getAll();
	}
}
