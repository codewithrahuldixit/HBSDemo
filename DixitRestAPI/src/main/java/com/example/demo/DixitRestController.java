package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DixitRestController {
@RequestMapping("/hello")
	public String sayhello(){
		return "helloworld";
		
		
	}
@RequestMapping("/student")
public Student getStudent(){
	return new Student(1,"mariyam");

}
@GetMapping("/students")
public List<Student> getStudents(){
	ArrayList<Student> a1=new ArrayList<>(5);
	a1.add(new Student (1,"mariyam"));
	a1.add(new Student (2,"ashish"));
return a1;	
	}
}
