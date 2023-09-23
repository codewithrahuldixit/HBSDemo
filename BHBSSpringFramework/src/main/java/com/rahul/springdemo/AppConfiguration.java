package com.rahul.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rahul.springdemo.model.Circle;
import com.rahul.springdemo.model.Drawing;
import com.rahul.springdemo.model.Shape;

@Configuration
public class AppConfiguration {

	@Bean
	public Circle getCircle() {
		return new Circle();
	}
	@Bean
	public Drawing getDrawing(Shape shape) {
		return new Drawing(shape);
	}
}
