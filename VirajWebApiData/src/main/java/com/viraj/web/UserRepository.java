package com.viraj.web;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Repository
public class UserRepository  {
	private static int userId=10;
	private static List <User> users = new ArrayList<User>();
	static {
			users.add(new User(++userId,"Rahul","IIT Bombay"));
			users.add(new User(++userId,"Anoop","IIT Bombay"));
	};
	
	public List<User> getUsers() {
		
		return users;
	}
	public ResponseEntity<User> save(User user) {
		user.setId(++userId);
		users.add(user);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(user.getId())
				.toUri();
		return ResponseEntity.created(location ).build();
	
		
	}
	
	public User findById(int id) {
		
	Predicate<? super User> check = user -> user.getId()==id;
	return users.stream().filter(check).findFirst().orElse(null);
	}

}
