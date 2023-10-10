package com.web.sectionb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.sectionb.model.Student;

@Service
public class StudentSerice {
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

}
