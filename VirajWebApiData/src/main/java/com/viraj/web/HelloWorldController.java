package com.viraj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private UserRepository repository;
	@GetMapping("/helloworld")
	public String sayHello() {
		return "Hello World !!!!!!!";
	}
	@GetMapping("/users")
	public List<User> getUser() {
		return repository.getUsers();
	}
	@PostMapping("/users")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
				 return repository.save(user);
	}
	@GetMapping("/users/{id}")
	public User findOne(@PathVariable int id) {
		return repository.findById(id);
	}
	
}
