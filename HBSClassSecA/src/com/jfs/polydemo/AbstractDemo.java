package com.jfs.polydemo;

abstract class XY{
	//We can Create a Member variable inside the Abstract class 
	XY(){
		x=10;
	}
	//these constructor is invoked through the child class constructor 
	//by Constructor Chaining
	XY(int x){
		this.x = x;
	}
	int x;
	void show() {
		System.out.println("I am Show of Absract");
	}
	//abstract void show1();
}
class ABC {
	void show() {
		System.out.println("I am Show of Child");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		//- Cannot instantiate the type XY
		XY x = new ABC();
		x.show();

	}

}
