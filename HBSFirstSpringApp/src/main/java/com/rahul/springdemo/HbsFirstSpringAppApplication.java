package com.rahul.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rahul.springdemo.model.Drawing;


@Configuration
@ComponentScan("com.rahul.springdemo.model")
public class HbsFirstSpringAppApplication {
	
	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HbsFirstSpringAppApplication.class);
		//Creating the Object
		//Rectangle shape = new Rectangle();
		//Circle shape = new Circle();
		//Injecting The Object
		//Drawing drawing = new Drawing(shape);
		
		System.out.println(context.getBean(Drawing.class));
	}

}
