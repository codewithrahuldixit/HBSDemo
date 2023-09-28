package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Drawing {

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
      @Autowired
	public void setShape(Shape shape) {
		this.shape = shape;
		System.out.println("Setter executed");
	}

	@Override
	public String toString() {
		return "Drawing [shape=" + shape + "]";
	}
	public void draw()
	{
		System.out.println(shape);
	}
	
}
