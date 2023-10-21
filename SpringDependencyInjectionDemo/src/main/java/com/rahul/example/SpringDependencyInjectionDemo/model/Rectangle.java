package com.rahul.example.SpringDependencyInjectionDemo.model;

import org.springframework.context.annotation.Lazy;

import jakarta.inject.Named;

@Named
@Lazy
public class Rectangle implements Shape {
	private int length;
	private int breath;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		System.out.println("Rectangle Object is created");
	}

	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}

}
