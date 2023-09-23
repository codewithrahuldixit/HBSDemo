package com.rahul.model.inherit02;

import com.rahul.model.Circle;

public class RuntimeDemo {

	public static void main(String[] args) {
		//Type mismatch: cannot convert from B to Circle
		Circle c = new Circle(22);
	}

}
