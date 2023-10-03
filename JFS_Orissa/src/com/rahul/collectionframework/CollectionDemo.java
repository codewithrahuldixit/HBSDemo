package com.rahul.collectionframework;

import java.util.ArrayList;

import com.rahul.jfs.PCDemo.Stack;

public class CollectionDemo {
public static void main(String[] args) {
	Stack s1 = new Stack(new Object[5]);
	s1.push(44);
	s1.push(55.5);
	System.out.println(s1.pop());
	System.out.println(s1.pop());
	ArrayList a1 = new ArrayList<>();
	a1.add(12);
	a1.add("rahul");
	a1.add(44.4);
	a1.add('c');
	a1.add(null);
	System.out.println(a1);
}
}
