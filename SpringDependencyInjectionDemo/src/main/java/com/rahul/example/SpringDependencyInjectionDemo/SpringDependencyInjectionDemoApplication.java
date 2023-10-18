package com.rahul.example.SpringDependencyInjectionDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.example.SpringDependencyInjectionDemo.model.Circle;

public class SpringDependencyInjectionDemoApplication {

	public static void main(String[] args) {
		var box = new AnnotationConfigApplicationContext(ConfDemo.class);
		Circle circle = box.getBean(Circle.class);
		System.out.println(circle);
	}

}
