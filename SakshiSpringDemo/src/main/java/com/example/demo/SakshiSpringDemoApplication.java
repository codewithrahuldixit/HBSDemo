package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SakshiSpringDemoApplication {

	public static void main(String[] args) { 
		var context = 
				new AnnotationConfigApplicationContext(SakshiAppConfig.class);
		Drawing d=context.getBean(Drawing.class);
		d.draw();
		
	}

}
