package com.rahul.model.inherit01;

public class SimpleDemo {
	public static void printInteger(long x) {
		System.out.println("The Long Value of x is "+x);
	}
	public static void printInteger(int x) {
		
		System.out.println("The int Value of x is "+x);
	}
	public static void main(String[] args) {
	
		//int 
			printInteger((byte)20);
	}

}
