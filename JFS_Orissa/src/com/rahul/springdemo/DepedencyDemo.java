package com.rahul.springdemo;

public class DepedencyDemo {

	public static void main(String[] args) {
		//We Creating Dependent Objects Manually And 
		//Inject it Into Another Object 
		Shape rectangle = new Rectangle(4,5);
		Circle circle = new Circle (4);
		
		//Injection Done Here
		Drawing d1 = new Drawing(circle);		
		Drawing d2 = new Drawing(rectangle);
		d1.draw();
		d2.draw();

	}

}
