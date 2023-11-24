package com.example.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.web.model.Student;
import com.example.web.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;
	private static int sid=100;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(++sid,"Rahul","rahul@gmail.com",9015088066l));
		repository.save(new Student(++sid,"Balram","balram@gmail.com",9015088066l));
		repository.save(new Student(++sid,"Rashmi","Rashmi@gmail.com",9015088066l));
		repository.save(new Student(++sid,"Amit","Amit@gmail.com",9015088066l));
		repository.save(new Student(++sid,"Ananya","Ananya@gmail.com",9015088066l));
		
	}

	public List<Student> retrieveAllStudent() {
		return repository.findAll();
	}

	public Student retrieveById(int id) {
		
		return repository.findById(id).get();
	}

	public void insertStudent(Student student) {
		student.setId(++sid);
		repository.save(student);
	}

	public Student removeById(int id) {
		Student student = repository.findById(id).get();
		repository.deleteById(id);
		return student;
	}
	
}
