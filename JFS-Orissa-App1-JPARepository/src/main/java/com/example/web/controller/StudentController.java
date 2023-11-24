package com.example.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.model.Student;
import com.example.web.service.StudentService;

@RestController
public class StudentController {
	
	private StudentService service;
	
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return service.retrieveAllStudent();
	}
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id){
		return service.retrieveById(id);
	}
	@PostMapping("/students")
	public List<Student> getAllStudent(@RequestBody Student student){
		service.insertStudent(student);
		return service.retrieveAllStudent();
	}
	@DeleteMapping("students/{id}")
	public Student deleteStudent(@PathVariable int id) {
		return service.removeById(id);
	}

}
