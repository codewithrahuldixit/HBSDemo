package com.web.sectionb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.web.sectionb.model.Student;

@Service
public class StudentService {
private static int sid=100;
private static ArrayList<Student> students = new ArrayList<Student>();
static {
	students.add(new Student(++sid,"Rahul","rahul@gmail.com"));
	students.add(new Student(++sid,"Viraj","Viraj@gmail.com"));
	students.add(new Student(++sid,"Shakshi","Shakshi@gmail.com"));
	students.add(new Student(++sid,"komal","komal@gmail.com"));
	
}
	public List<Student> getAll() {
		
		return students;
	}
	public Student getById(int id) {
		Predicate<? super Student> predicate = student -> student.getId()==id;
		return students.stream().filter(predicate ).findFirst().get();
	}

}
