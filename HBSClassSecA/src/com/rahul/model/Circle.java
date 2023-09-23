package com.rahul.model;

//blue print of the object
//Map
public class Circle {
	//Property
	//member variable
	//instance variable
	int radius;
	
	//No argument constructor
	//Illegal modifier for the constructor in type Circle; 
	//only public, protected & private are permitted
	public Circle (){
		this(22);
	}
	//Parameterized Constructor 
	public Circle(int r){
		radius = r;
	}
	//member method
	//instance method
	public double area(){
		 return 3.14*radius*radius;
	 }
	public double perimeter() {
		return 2*3.14*radius;
	}
	public void setRadius(int r) {
		radius=r;
	}
}
