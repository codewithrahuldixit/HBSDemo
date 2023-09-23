package com.rahul.SpringWebDeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.SpringWebDeb.model.Student;

@RestController
public class RestControllerDemo {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World !!!!!!!!!!!!" + new Student(1,"Rahul");
	}
	@GetMapping("/student")
	public Student getStudent() {
		return new Student(1,"Rahul");
	}
}
