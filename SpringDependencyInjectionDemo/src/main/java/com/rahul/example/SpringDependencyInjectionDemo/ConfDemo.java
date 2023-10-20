package com.rahul.example.SpringDependencyInjectionDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.rahul.example.SpringDependencyInjectionDemo.model.Circle;
import com.rahul.example.SpringDependencyInjectionDemo.model.Drawing;
import com.rahul.example.SpringDependencyInjectionDemo.model.Rectangle;
import com.rahul.example.SpringDependencyInjectionDemo.model.Shape;

@Configuration
public class ConfDemo {
/*
	@Bean//These method Automatically Invoked 
	public Circle getCircle() {
		return new Circle(4);
	}
	
	@Bean
	//By This Annotation We are giving the preference to 
	//Rectangle bean over other bean
	@Primary
	public Rectangle getRectangle() {
		return new Rectangle(4,5);
	}
	
	@Bean
	public Drawing getDrawing(Shape shape) {
		return new Drawing (shape);
	}
	
*/}
