package com.rahul.jims;

public class Circle <T> {
	private T radius;

	public T getRadius() {
		return radius;
	}

	public void setRadius(T radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	

}
