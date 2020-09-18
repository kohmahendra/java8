package com.mahendra.section4;

public class ThisNoLambda {
	String var = "MainClass";

	public static void main(String[] args) {
		ThisNoLambda t = new ThisNoLambda();
		t.m2();
	}

	public void m2() {
		MyInterface myInterface = new MyInterface() {
			String var = "anonymous inner class";
			public void m1() {
				System.out.println(this.var);
				System.out.println(var);
			}
		};
		myInterface.m1();
	}
}

interface MyInterface {
	public void m1();
}
