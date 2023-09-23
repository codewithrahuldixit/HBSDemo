package com.rahul.model.inherit02;

import com.rahul.model.inherit.A;

public class B extends A{
	private int y ;

	public B() {
	y=0;
	}

	public B(int y) {
	this.y = y;
	}
	
	public B(int y,int x) {
		//this(22);
		super(x);//Super must be the first statement of the block
		
		this.y = y;
		}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void showy() {
		System.out.println("The Value of y is "+y);
	}

	public void showxy() {
		//The field A.x is not visible
		//Parent private can't access directly 
		//here because it is not visible here
		System.out.println("The Value of x is "+x);
		System.out.println("The Value of y is "+y);
	}
	
}
