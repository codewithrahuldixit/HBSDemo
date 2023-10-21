package com.rahul.example.SpringDependencyInjectionDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rahul.example.SpringDependencyInjectionDemo.model.Drawing;

@Configuration
@ComponentScan
public class SpringDependencyInjectionDemoApplication {


	public static void main(String[] args) {
		//We are (initializing | Creating Object of)  the Spring Context 
		var box = new AnnotationConfigApplicationContext(SpringDependencyInjectionDemoApplication.class);
		System.out.println("Drawing Required Here");
		Drawing d1 = box.getBean(Drawing.class);
		System.out.println(d1);
		/*System.out.println(d1.getShape().hashCode());
		Drawing d2 = box.getBean(Drawing.class);
		System.out.println(d2.hashCode());
		System.out.println(d2.getShape().hashCode());
		Drawing d3 = box.getBean(Drawing.class);
		System.out.println(d3.hashCode());
		System.out.println(d3.getShape().hashCode());*/
	}

}
