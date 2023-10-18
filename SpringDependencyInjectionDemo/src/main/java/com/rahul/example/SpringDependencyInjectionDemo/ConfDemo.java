package com.rahul.example.SpringDependencyInjectionDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rahul.example.SpringDependencyInjectionDemo.model.Circle;
import com.rahul.example.SpringDependencyInjectionDemo.model.Rectangle;

@Configuration
public class ConfDemo {

	@Bean
	public Circle getCircle() {
		return new Circle(4);
	}
	
	@Bean
	public Rectangle getRectangle() {
		return new Rectangle(4,5);
	}
	
}
