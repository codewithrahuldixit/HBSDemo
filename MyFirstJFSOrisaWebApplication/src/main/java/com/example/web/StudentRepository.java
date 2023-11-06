package com.example.web;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	
	private JdbcTemplate template;
	private static String insert_Query="""
			insert into Student 
			values (?,?,?);
			""";
	private static int sid = 100;
	public StudentRepository(JdbcTemplate template) {
		super();
		this.template = template;
		template.update(insert_Query,++sid,"RAHUL","RAHUL@GMAIL.COM");
		template.update(insert_Query,++sid,"balram","balram@gmail.COM");
		template.update(insert_Query,++sid,"patnaik","patnaik@gmail.COM");
		template.update(insert_Query,++sid,"sonu","RAHUL@GMAIL.COM");
		template.update(insert_Query,++sid,"rahmi","RAHUL@GMAIL.COM");
	}
	
	
	
}
