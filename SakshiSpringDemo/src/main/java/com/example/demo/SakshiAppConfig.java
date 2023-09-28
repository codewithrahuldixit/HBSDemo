package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class SakshiAppConfig {
	@Bean
	@Qualifier("Circle")
 public Circle getCircle()
 {
	 return new Circle(10);
	 
 }
	@Bean
	 public Drawing getDrawing(@Qualifier("Circle")Shape shape)
	 {
		 return new Drawing(shape);
		 
	 }
	 @Bean
	 @Primary
	 public Rectangle getRectangle()
	 {
		return new Rectangle(10,20); 
	 }


}
