package com.rahul.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.rahul.springdemo.model.Circle;
import com.rahul.springdemo.model.Drawing;
import com.rahul.springdemo.model.Rectangle;
import com.rahul.springdemo.model.Shape;

@Configuration
public class DrawingConfig {

	@Bean
	public Circle getCircle() {
		return new Circle();		
	}
	@Bean
	@Primary
	public Rectangle getRectangle() {
		return new Rectangle(12,12);		
	}
	@Bean
	public Drawing getDrawing(Shape shape) {
		return new Drawing(shape);		
	}
}
