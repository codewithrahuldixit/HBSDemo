package com.rahul.example.SpringDependencyInjectionDemo.model;

import org.springframework.context.annotation.Lazy;

import jakarta.inject.Named;

@Named
@Lazy
public class Square implements Shape {
private int side;

public Square() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Square Object is created");
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

}
