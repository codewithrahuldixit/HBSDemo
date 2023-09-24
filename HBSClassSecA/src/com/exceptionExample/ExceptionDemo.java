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
		if(y==0)
		throw new ArithmeticException();
		System.out.println(x/y);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Code Completes Here");
		

	}

}
