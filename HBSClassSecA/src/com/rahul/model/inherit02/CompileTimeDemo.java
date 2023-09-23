package com.rahul.model.inherit02;

public class CompileTimeDemo {
	//M1
	public static int sum(int x , int y) {return x+y;}
	//M2
	public static int sum(int x , int y,int z) {return x+y+z;}
	//M3
	public static double sum(double x , double y) {return x+y;}
	
	public static void main(String[] args) {
		//The method sum(int, int, int) in the
		//type CompileTimeDemo is not applicable
		//for the arguments (int, int, int, int)
		/* 1. It is Decided at Compile time Which method is going to be 
		 * invoked hence it is known as compile time polymorphism
		 * 2. it is fixed @ Compile time which method is going to be invoked @ Execution.
		 * hence it is known as static binding 
		 * 3. it is known as early binding because it is decide before 
		 * execution which method is going to be execute
		 * */
		System.out.println(sum(5,6,5));
		System.out.println(sum(5,6));
	}

}
