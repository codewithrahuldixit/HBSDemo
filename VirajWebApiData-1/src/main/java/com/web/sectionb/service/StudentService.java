package com.web.sectionb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.sectionb.StudentRepository;
import com.web.sectionb.model.Student;

@Service
public class StudentService {
private static int sid=100;
private StudentRepository repository;

public StudentService(StudentRepository repository) {
	super();
	this.repository = repository;
	repository.save(new Student(++sid,"Rahul","rahul@gmail.com"));

	repository.save(new Student(++sid,"Viraj","Viraj@gmail.com"));
	repository.save(new Student(++sid,"Shakshi","Shakshi@gmail.com"));
	repository.save(new Student(++sid,"komal","komal@gmail.com"));

}	public List<Student> getAll() {
		return repository.findAll();
		//return students;
	}
	public Student getById(int id) {
		return repository.findById(id).get();
		//Predicate<? super Student> predicate = student -> student.getId()==id;
		//return students.stream().filter(predicate ).findFirst().get();
	}
	public void save(Student student) {
		student.setId(++sid);
		repository.save(student);
	}
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 repository.deleteById(id);;
	}

}
