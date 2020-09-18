package com.mahendra.section5;

public class Test implements MyInterface {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();

	}

	@Override
	public void test() {

	}

	public void m1() {
		System.out.println("Test class");
	}

}
