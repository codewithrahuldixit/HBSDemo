package com.abhishekDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class abhishekDemo {
	@RequestMapping("hello")
	public String Hello() {
		return "Hello Abhishek";
	}
	
	@RequestMapping("student")
	public abhishekStudent getStudent() {
		return new abhishekStudent(1,"Abhishk","Hierank");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name)); 
	}
}
