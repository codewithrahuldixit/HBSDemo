package com.example.rahul.FirstSpringWeb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstSpringWebApplication {

	public static void main(String[] args) {
		//Create Spring Context/Application Context
		var box = new AnnotationConfigApplicationContext(ConfigDemo.class);
		Circle circle = box.getBean(Circle.class);
		Drawing d1 = box.getBean(Drawing.class);
		System.out.println(circle.hashCode());
		System.out.println(d1.getCircle().hashCode());
	}

}
