package com.rahul.SpringWebDeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

	@GetMapping("/sayHello")
	public String Hello() {
		return "Hello World!!!!!!!!!!!!!!!!";
	}
}
