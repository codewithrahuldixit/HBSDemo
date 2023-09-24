package com.rahul.anonymousDemo;

interface I1 {
	void m1();

	void m2();

}

public class AnonymousDemo {
	public static void main(String[] args) {
		//Class with no Name is called Anonymous Class
		
		I1 i = new I1() {

			@Override
			public void m1() {
				System.out.println("Method M1 Call");
				
			}

			@Override
			public void m2() {
				System.out.println("Method M2 Call");
				
			}
			
		};
		I1 i1 = new I1() {

			@Override
			public void m1() {
				System.out.println("Method M1of i1 Call");
				
			}

			@Override
			public void m2() {
				System.out.println("Method M2 i1 Call");
				
			}
			
		};
		
		i.m1();
		i.m2();
		i1.m1();
		i1.m2();

	}
}
