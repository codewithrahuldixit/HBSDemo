package com.example.rahul.FirstSpringWeb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//Indicates that a class declares one or more @Bean methods and 
//may be processed by the Spring container to generate bean/Object 
//definitions and service requests for those beans at runtime, for example: 
//The class which annotated with @Configuration that 
//object is created implicitly
@Configuration
public class ConfigDemo {

	@Bean
	public Circle getCircle() {
		return new Circle();
	}
	
	@Bean
	public Rectangle getRectangle() {
		return new Rectangle();
	}
	@Bean
	public Drawing getDrawing(Circle circle) {
		return new Drawing(circle);
	}
}
