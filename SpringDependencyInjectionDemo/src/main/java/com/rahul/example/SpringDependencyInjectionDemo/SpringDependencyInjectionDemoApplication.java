package com.rahul.example.SpringDependencyInjectionDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rahul.example.SpringDependencyInjectionDemo.model.Drawing;

@Configuration
@ComponentScan("com.rahul.example.SpringDependencyInjectionDemo")
public class SpringDependencyInjectionDemoApplication {


	public static void main(String[] args) {
		//We are (initializing | Creating Object of)  the Spring Context 
		var box = new AnnotationConfigApplicationContext(SpringDependencyInjectionDemoApplication.class);
		Drawing d1 = box.getBean(Drawing.class);
		System.out.println(d1);
	}

}
