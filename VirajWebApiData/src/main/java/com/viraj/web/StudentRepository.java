package com.viraj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class StudentRepository {
@Autowired
private EntityManager manager;
	
public void save(Student student) {
		manager.merge(student);
		
	}
}
