package com.rahul.example.SpringDependencyInjectionDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Drawing {

@Autowired
private Shape shape;
//Constructor Invokes Automatically when Object is Created 
public Drawing(Shape shape) {
	super();
	//System.out.println("Injection is done using Costructor");
	this.shape = shape;
}

public Shape getShape() {
	return shape;
}
//Setter Injection
//@Autowired
public void setShape(Shape shape) {
	System.out.println("Injection Done Usind Setter");
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
