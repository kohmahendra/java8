package com.mahendra.section12;

public class MethodReference {

	public static void main(String[] args) {
		MyInterface myInterface = new MethodReference()::m2;		
		myInterface.m1();
	}

	public void m2() {
		System.out.println("MethodReference.m2()");
	}

}
