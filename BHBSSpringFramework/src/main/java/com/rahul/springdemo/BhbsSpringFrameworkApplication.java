package com.rahul.springdemo;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.springdemo.model.Drawing;
import com.rahul.springdemo.model.Rectangle;
import com.rahul.springdemo.model.Shape;


public class BhbsSpringFrameworkApplication {

	public static void main(String[] args) {
		var context=
				new AnnotationConfigApplicationContext
				(AppConfiguration.class);
		Drawing drawing = context.getBean(Drawing.class);
		drawing.draw();
			}

}
