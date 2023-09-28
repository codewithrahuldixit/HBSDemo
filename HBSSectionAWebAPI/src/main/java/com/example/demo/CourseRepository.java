package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Course;
@Repository
public class CourseRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	String insert_query = """			
			insert into Course (id,name,mentor) values (?,?,?);
		""";
	
	public void save(Course course) {
		jdbcTemplate.update(insert_query,course.getId(),course.getName(),course.getMentor());
	}
}
