package com.rahul.springdemo.model;

public class Drawing {
	
	Shape shape ;

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
	public void draw() {
		System.out.println(shape);
	}
}
