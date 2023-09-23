package com.rahul.model.singletonexample;

//Lazy implementation 
//When Requirement is there then only the object is created 
class A{
	public static A a;

	private A() {
		
	}
	public static A getInstance(){
		if (a==null)
		a= new A();
		return a;
	}
	
}
//Eager implementation
//It creates an Object before the requirement
class B{
	public static B a = new B();

	private B() {
		
	}
	public static B getInstance(){
		
		return a;
	}
	
}

public class SingletonDemo {

public static void main(String[] args) {

	System.out.println(A.a);
	A a1 = A.getInstance();
	System.out.println(A.a);
	System.out.println(B.a);
	B b1 = B.getInstance();
	System.out.println(B.a);
	//The constructor A() is not visible
	/*A a1 = A.getInstance();
	A a2 = A.getInstance();
	A a3 = A.getInstance();
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);*/
}
	
}
