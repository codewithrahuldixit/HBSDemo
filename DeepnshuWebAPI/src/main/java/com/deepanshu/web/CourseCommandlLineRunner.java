package com.deepanshu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

@Repository
public class CourseCommandlLineRunner implements CommandLineRunner{
	@Autowired
	CourseRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(12 ,"BCA","Arvind"));
	}
	
}
