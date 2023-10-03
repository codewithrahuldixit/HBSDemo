package com.viraj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
@Service
public class StudentCommandLineRunner implements CommandLineRunner {
	@Autowired
private StudentRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Student(101,"Viraj","Bca",9068585622L));
	}

}
