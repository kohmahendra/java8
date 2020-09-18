package com.mahendra.section2;

public class Class8NoLambda {
	public static void main(String[] args) {
		Test t1 = new TestImpl();
		t1.m1();
	}
}
interface Test {
	public void m1();
}
class TestImpl implements Test {
	@Override
	public void m1() {
		System.out.println("Hello World!");
	}
}