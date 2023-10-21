package com.rahul.example.SpringDependencyInjectionDemo.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

import jakarta.inject.Named;

@Named
@Primary
@Lazy
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Circle implements Shape{
	private int radius;
	
	public Circle() {
		radius=2;
		System.out.println("Circle Object is created");
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
