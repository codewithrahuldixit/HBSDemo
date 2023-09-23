package com.rahul.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Drawing {

	@Autowired
	@Qualifier("square")
	private Shape shape;
	
	public Drawing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Drawing(Shape shape) {
		super();
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Drawing [shape=" + shape + "]";
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Initialization is done");
	}
	
}
