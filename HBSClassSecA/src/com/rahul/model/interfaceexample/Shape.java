package com.rahul.model.interfaceexample;

//1. if Interface Doesn't contain any method known as Marker Interface : 
//Predefine Marker Interface : Serializable
//2. If Interface which contains only One Abstract Method known as Functional Interface 
//Predefine Functional Interface : Comparable | Runnable
public interface Shape {
	//it is by default final and static
	//int x = 12;
	//public and abstract 
	double area();
	default double perimeter() {
		System.out.println("To be Implemented");
		return 0.0;
		
	}
}
