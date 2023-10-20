package com.rahul.example.SpringDependencyInjectionDemo.model;

public class Drawing {
private Shape shape;

public Drawing(Shape shape) {
	super();
	this.shape = shape;
}

public void draw() {
	System.out.println(shape);
}

@Override
public String toString() {
	return "Drawing [shape=" + shape + "]";
}

}
