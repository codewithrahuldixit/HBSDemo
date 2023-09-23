package com.jfs.Lecture01;

public class BitWiseDemo {
	public static void main(String[] args) {
		//int x=-10;
		//int y =20;
		//int z=0;
		//z = x|y;
		//z=x&y;
		//z=x^y;
		//z=x>>1; //Shift right by 1 the value is divided by 2
		//z=x<<1; //shift left by 1 the value is multiplied by 2
		byte z=-86;
		z = (byte) ((byte)z>>>1);
		System.out.println(z);
	}
}
