package com.rahul.model.inherit;

public class A {
	protected int x;

	public A() {
		x=0;
	}

	public A(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void showX() {
		System.out.println("The Value of X "+x);
	}
}
