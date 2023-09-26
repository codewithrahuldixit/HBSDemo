package com.exceptionExample;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X & Y");
		x= sc.nextInt();
		y=sc.nextInt();
		//Handled by Default Handler
		try {
			//Implicitly the object of Arithmetic Exception is created by JVM
			//PreDefined Exception
			//throw is used to throw the exception Object
				System.out.println(x/y);
			}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		

		System.out.println("Code Completes Here");
		
		System.out.println("Code Completes Here");
		

	}

}
