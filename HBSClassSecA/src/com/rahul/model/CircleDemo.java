package com.rahul.model;

public class CircleDemo {

	public static void main(String[] args) {
			int x =10;
		/*
		 * 1. It initialize the object at the object creation 
		 * 2. Constructor is a special member method of the class 
		 * 3. Constructor is having same name as class
		 * 4. it never have any return type even void
		 * 5. Any number of constructor a class have
		 * 6. Any Access specifier can be applied on Constructors
		 * 7. we can't apply static modifier on constructor
		 * 8. we can't apply final
		 * 9. Constructors never be inherited 
		 * 10.We can call one constructor from another constructor know as Constructor chaining
		*/
		//The constructor Circle(int) is undefined
		//Circle c = new Circle(10);
		//The constructor Circle(String) is undefined
		Circle c1 = new Circle ();
		System.out.println("The value of radius = "+c1.radius);//97
		System.out.println("The area of the circle is = "+c1.area());//10
		System.out.println("The perimeter of the circle is = "+c1.perimeter());//10
	}

}
