package com.example.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.model.Student;
import com.example.web.service.StudentService;

@RestController
public class StudentController {
	
	StudentService service;
	
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	//i. getAllStudents() : List <Student> :- Fetching All The Information Stored in Database
	@GetMapping("/students")
	public List <Student> getStudents(){
		return service.reteriveAllStudents();
	}
	@GetMapping("students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getById(id);
	}

	//ii. getStudent(int id) : Student :- return only one student matched 
	//iii. storeStudent(Student student) :- Stored the Student into database
	//iv. deleteStudent(int id ) : deleting the student from the table matched 

}
