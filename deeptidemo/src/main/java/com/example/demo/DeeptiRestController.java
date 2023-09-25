package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeeptiRestController {
@GetMapping("/hello")
	public String sayhello()

	{
		return "Hello World!";

	}
}
