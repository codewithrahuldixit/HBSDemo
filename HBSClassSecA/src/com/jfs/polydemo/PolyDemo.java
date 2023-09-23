package com.jfs.polydemo;

import java.util.Scanner;

//final 
// Q : Please tell me the Predefined final classes ?
// String | StringBuffer | StringBuilder | All The Wrapper Classes Are Final

class A{
	///Integer s;
	public void show() {
		System.out.println("I am show of A");
	}
}
//The type B cannot subclass the final class A
class B extends A{
	public void Method1() {
		System.out.println("I Method1 of B");
	}
	/*Multiple markers at this line
	- overrides com.jfs.polydemo.A.show
	- Cannot override the final method from A*/
	
	/*- This instance method cannot override the static method from A
	- overrides com.jfs.polydemo.A.show*/
	public void show() {
		Method1();
		System.out.println("I am show of B");
	}
}
public class PolyDemo {

	public static void main(String[] args) {
		//Parent class refrence variable can hold the Object of It Sub Classes 
		Scanner sc = new Scanner(System.in);
		int choice ;
	
		
		
		A a= new B();
		//The method Method1() 
		//is undefined for the type A
		
		//By using parent class reference variable we only call 
		//those method of child class which is overridden By Child Class
		a.show();
		
		
		
		
		
		
		A [] a1 = new A[3];
	for(int i =0;i<3;i++)
	{
		System.out.println("Please Enter 0 to Create A Object");
		System.out.println("Please Enter any Integer to Create B Object");
		choice = sc.nextInt();
		if (choice == 0)
		{
			a1[i]= new A();
		}
		else {
			a1[i]=new B();
		}		
	}
	
	
	for(int i =0;i<3;i++) {
		a1[i].show();
	}
	
	}

}
