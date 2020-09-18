package com.mahendra.section4;

public class LambdaTest {

	public static void main(String[] args) {
		LambdaTest l = new LambdaTest();
		l.m2();
	}

	public void m2() {
		int i = 100;
		MyInterface3 mi = () -> {
			int j = 20;
			System.out.println(i);
			System.out.println(j);
			// i=60; // Compile time exception Local variable i defined in an enclosing
			// scope must be final or effectively final
			/*
			 * The local variable which is referenced from lambda expression is effectively
			 * final (even you don't mark it as final) It is implicitly final
			 **/
		};
		mi.m1();

		Calculator d = (a, b) -> {
			return a + b;
		};
		System.out.println(d.add(12, 34));
		
	}

}

interface MyInterface3 {
	public void m1();
}

interface Calculator {
	public int add(int i, int j);
}
