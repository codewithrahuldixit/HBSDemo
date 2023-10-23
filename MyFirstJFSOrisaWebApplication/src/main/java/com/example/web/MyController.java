package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	// localhost:8080/hello
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello User";
	}

}
