package com.rahul.doubt;

import java.util.ArrayList;
import java.util.Vector;
record Student(int id, String name,long contact) {};
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Student> a1 = new ArrayList<Student>();
		//Collection Framework Perform Operations Only On Objects
		//ArrayList Object are not thread safe
		//Vector Objects are thread safe because 
		//the most of the methods are synchronized
		Vector<Integer> a1= new Vector<Integer>();
		a1.add(55);//Auto Boxing
		a1.add(new Integer(55));
		System.out.println(a1);
		int x = a1.get(0);//Auto Unboxing
		System.out.println(x);

	}

}
