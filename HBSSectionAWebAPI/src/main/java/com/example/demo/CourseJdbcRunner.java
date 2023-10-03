package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Course;

@Component
public class CourseJdbcRunner implements CommandLineRunner{
	
	@Autowired
	CourseRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course (101,"Java","Rahul"));
		repository.save(new Course (102,"Java","Monika"));
		repository.save(new Course (103,"Java","Arvind"));
	}

}
