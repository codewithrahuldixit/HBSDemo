package com.rahul.springdemo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("square")
public class Square implements Shape{
	private int side;

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
}
