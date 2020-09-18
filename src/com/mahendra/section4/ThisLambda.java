package com.mahendra.section4;

public class ThisLambda {
	String var = "MainClass";

	public static void main(String[] args) {
		ThisLambda t = new ThisLambda();
		t.m2();
	}

	public void m2() {
		MyInterface2 myInterface = () -> {
			String var = "anonymous inner class";
			System.out.println(this.var);
			System.out.println(var);
		};
		myInterface.m1();
	}
}

interface MyInterface2 {
	public void m1();
}
