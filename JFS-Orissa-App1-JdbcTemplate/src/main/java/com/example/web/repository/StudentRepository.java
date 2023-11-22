package com.example.web.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.web.model.Student;

@Repository
public class StudentRepository {

	private JdbcTemplate template;
	
	private static String insert_Query ="""
			insert into Student 
			values (?,?,?);
			""";

	  static String find_All = """
	           SELECT *
	           FROM Student;
	           """;
	  static String find_By_Id="""
	  		select * from Student where id = ?;
	  		""";
	private static int sid = 100;
	public StudentRepository(JdbcTemplate template) {
		super();
		this.template = template;
		template.update(insert_Query,++sid,"RAHUL","RAHUL@GMAIL.COM");
		template.update(insert_Query,++sid,"balram","balram@gmail.COM");
		template.update(insert_Query,++sid,"patnaik","patnaik@gmail.COM");
		template.update(insert_Query,++sid,"sonu","RAHUL@GMAIL.COM");
		template.update(insert_Query,++sid,"rashmi","RAHUL@GMAIL.COM");
	}
	public List<Student> retrieveAll() {
		
		   return template.query(find_All,new StudentRowMapper());
		
	}
	public Student findById(int id) {
		
		return template.query(find_By_Id
				,new StudentRowMapper()
				,id)
				.stream()
				.findFirst()
				.get();
		}
	
	
	
}
