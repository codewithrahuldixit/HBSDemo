package com.rahul.SpringWebDeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.SpringWebDeb.model.Student;
@Service
public class StudentService {
	private int sid =10;
	//private static ArrayList<Student> students = new ArrayList<Student>();
	
	
	private  StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository=repository;
		repository.save(new Student(++sid,"Rahul",9015088066L));
		repository.save(new Student(++sid,"Dipanshu",9999999990L));
		repository.save(new Student(++sid,"Minhaz",9898989898L));
		repository.save(new Student(++sid,"Ashish",9876543210L));
	
	}
	
	public List < Student> getAllStudents() {
		//return students;
		return repository.findAll();
	}
	public void saveStudent(Student student) {
		student.setId(++sid);
		repository.save(student);
	}

	public Student getById(int id) {
		//Predicate<? super Student> predicate = student -> student.getId()==id;
		return repository.findById(id).get();
		//return students.stream().filter(predicate).findFirst().get();
		
	}

	public void deleteById(int id) {
		repository.deleteById(id);	
		}

}
