package com.rahul.anonymousDemo;

interface calc {
	int square(int x);
}

interface calc1 {
	int calculator(int x, int y);
}

interface Display {
	void show();
}

public class LambdaExample {
	static void Hello(Display d1) {
		System.out.println("Hello Is Executed");
		d1.show();
	}

	public static void main(String[] args) {
		// Lambda Expression
		// Achieved Functional Programming
		// if we have only one line of code we need not to write return keyword
		calc c = x -> x * x;
		System.out.println(c.square(4));
		calc c1 = x -> {
			if (x % 2 == 0)
				return 0;
			return 1;
		};

		System.out.println(c1.square(12));
		// if code functional method
		// has more than one argument while writing lambda we have to pass in brackets
		calc1 calculate = (x, y) -> x * y;

		System.out.println(calculate.calculator(12, 13));
		//By Lambda expresion we can pass the method inside method
		Display d1 = () -> System.out.println("Hello World");
		Hello(d1);
	}

}
