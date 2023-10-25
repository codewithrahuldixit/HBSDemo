package com.example.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	// http://localhost:8080/hello
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello User";
	}

	// http://localhost:8080/student
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101, "Balram", "balram@gmail.com");
	}

	// http://localhost:8080/student/101/Rahul/rahul@gmail.com
	@RequestMapping("/student/{id}/{name}/{email}")
	public Student storeStudent(
			@PathVariable int id, 
			@PathVariable String name, 
			@PathVariable String email
			) 
	{
		return new Student(id, name, email);
	}
}
