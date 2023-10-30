package com.example.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
static int sid=100;
static private ArrayList<Student> students = new ArrayList<Student>();
static {
	students.add(new Student(++sid,"Rahul","rahul@gmail.com"));
	students.add(new Student(++sid,"Balram","balram@gmail.com"));
	students.add(new Student(++sid,"Shivraj","shivraj@gmail.com"));
	students.add(new Student(++sid,"Satruit","satru@gmail.com"));
}
public List<Student> getAll() {
	
	return students;
}
}