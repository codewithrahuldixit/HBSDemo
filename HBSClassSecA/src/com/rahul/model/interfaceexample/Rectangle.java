package com.rahul.model.interfaceexample;
//The type Rectangle must implement the inherited abstract method Shape.area()
public class Rectangle implements Shape{
	private int length ;
	private int breath;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public double area() {
		
		return length*breath;
	}
	

}
