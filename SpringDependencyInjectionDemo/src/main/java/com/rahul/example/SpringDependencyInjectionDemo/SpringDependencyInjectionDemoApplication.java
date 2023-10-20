package com.rahul.example.SpringDependencyInjectionDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rahul.example.SpringDependencyInjectionDemo.model.Drawing;
import com.rahul.example.SpringDependencyInjectionDemo.model.Shape;

@Configuration
@ComponentScan
public class SpringDependencyInjectionDemoApplication {


	public static void main(String[] args) {
		//We are (initializing | Creating Object of)  the Spring Context 
		var box = new AnnotationConfigApplicationContext(SpringDependencyInjectionDemoApplication.class);
		Drawing d1 = box.getBean(Drawing.class);
		System.out.println(d1);
	}

}
