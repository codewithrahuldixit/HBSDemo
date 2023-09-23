package com.rahul.model.interfaceexample;

public class Square implements Shape{
	private int side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	@Override
	public double area() {
		
		return side*side;
	}
	public double perimeter() {
		return 2*side;
	}
	
}
