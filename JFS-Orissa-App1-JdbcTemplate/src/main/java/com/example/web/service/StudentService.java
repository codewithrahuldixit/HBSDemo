package com.example.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.web.model.Student;
import com.example.web.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	public List<Student> reteriveAllStudents() {
		List<Student> students = repository.retrieveAll();
		return students;
	}

	public Student getById(int id) {

		return repository.findById(id);
	
	}

}
