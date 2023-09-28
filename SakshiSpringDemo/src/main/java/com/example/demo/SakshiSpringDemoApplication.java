package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration 
@ComponentScan("com.example.demo")
public class SakshiSpringDemoApplication {

	public static void main(String[] args) { 
		var context = 
				new AnnotationConfigApplicationContext(SakshiSpringDemoApplication.class);
		Drawing d=context.getBean(Drawing.class);
		d.draw();
		
	}

}
