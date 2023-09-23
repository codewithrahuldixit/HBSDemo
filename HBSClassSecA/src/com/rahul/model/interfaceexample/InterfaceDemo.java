package com.rahul.model.interfaceexample;

public class InterfaceDemo {
public static void main(String[] args) {
	//Circle shape = new Circle(10);
	//The constructor Drawing(Rectangle) is undefined
	//Rectangle shape = new Rectangle(10,20);
	Square shape = new Square(12);
	Drawing d1 = new Drawing(shape);
	System.out.println(d1.getShape().perimeter());
}
}
