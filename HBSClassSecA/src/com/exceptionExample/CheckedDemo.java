package com.exceptionExample;

import java.io.IOException;
import java.util.Scanner;

public class CheckedDemo {

	public static void show() throws IOException {
		System.out.println("Before Exception");
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Y");
		y = sc.nextInt();
		if (y == 0)
			// throw new ArithmeticException();

			// IOException is an Unchecked Exception
			// Unhandled exception type IOException

			throw new IOException();

		System.out.println("after exception Exception");
	}

	public static void main(String[] args) {
		try {
			System.out.println("Before Exit");
			// Unhandled exception type IOException
			System.exit(10);
			show();
			System.out.println("after exception Exception in main");
		
		}
		// Catch All

		// Unreachable catch block for IOException.
		// It is already handled by the catch block for Exception
		catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {

		}
		finally {
			System.out.println("Finally is executed");
			show();
		}
		
	}

}
