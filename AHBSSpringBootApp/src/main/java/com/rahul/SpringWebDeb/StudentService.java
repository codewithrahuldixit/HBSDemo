package com.rahul.SpringWebDeb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.SpringWebDeb.model.Student;
@Service
public class StudentService {
	private static int sid =10;
	private static ArrayList<Student> students = new ArrayList<Student>();
	static {
		students.add(new Student(++sid,"Rahul",9015088066L));
		students.add(new Student(++sid,"Dipanshu",9999999990L));
		students.add(new Student(++sid,"Minhaz",9898989898L));
		students.add(new Student(++sid,"Ashish",9876543210L));
	}
	public StudentService() {
		
	}
	
	public List < Student> getAllStudents() {
		return students;
	}
	public void saveStudent(Student student) {
		student.setId(++sid);
		students.add(student);
	}

}
