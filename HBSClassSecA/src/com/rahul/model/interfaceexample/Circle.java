package com.rahul.model.interfaceexample;

//blue print of the object
//Map
public class Circle implements Shape {
	//Property
	//member variable
	//instance variable
	int radius;
	
	//No argument constructor
	//Illegal modifier for the constructor in type Circle; 
	//only public, protected & private are permitted
	public Circle (){
		radius = 5;
	}
	//Parameterized Constructor 
	public Circle(int r){
		radius = r;
	}
	//member method
	//instance method
	public double area(){
		//The final field Shape.x cannot be assigned
		//x=13;
		 return 3.14*radius*radius;
	 }
	public double perimeter() {
		return 2*3.14*radius;
	}
	public void setRadius(int r) {
		radius=r;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
