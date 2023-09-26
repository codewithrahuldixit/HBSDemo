package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SakshiAppConfig {
	@Bean
 public Circle getCircle()
 {
	 return new Circle(10);
	 
 }
	@Bean
	 public Drawing getDrawing(Shape shape)
	 {
		 return new Drawing(shape);
		 
	 }
	  


}
