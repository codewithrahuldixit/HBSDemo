package com.rahul.example.SpringDependencyInjectionDemo.model;

public class Circle implements Shape{
	private int radius;
	
	public Circle() {
		radius=2;
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
