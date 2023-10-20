package com.rahul.example.SpringDependencyInjectionDemo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "square")
public class Square implements Shape {
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

}
