package com.rahul.example.SpringDependencyInjectionDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.example.SpringDependencyInjectionDemo.model.Circle;
import com.rahul.example.SpringDependencyInjectionDemo.model.Drawing;
import com.rahul.example.SpringDependencyInjectionDemo.model.Rectangle;

public class SpringDependencyInjectionDemoApplication {

	public static void main(String[] args) {
		//We are (initializing | Creating Object of)  the Spring Context 
		var box = new AnnotationConfigApplicationContext(ConfDemo.class);
		Drawing d1 = box.getBean(Drawing.class);
		System.out.println(d1);
	}

}
