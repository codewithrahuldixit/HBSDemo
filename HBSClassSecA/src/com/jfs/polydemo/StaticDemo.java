package com.jfs.polydemo;
class XYZ{
	int x;
	static int y;
	void show() {
		System.out.println("The value of X : "+x++);
		System.out.println("The value of Y : "+y++);
	}
	
	static void show1() {
		//Cannot make a static reference to the non-static field x
		//System.out.println("Static method The value of X : "+x++);
		System.out.println("Static method The value of Y : "+y++);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		XYZ a = new XYZ();
		XYZ a1 = new XYZ();
		a.show();
		a1.show();
		a.show();
		a1.show();
		

	}

}
