package com.mahendra.section5;

public interface MyInterface {

	public void test();

	public static final double PI = 3.14;

	public default int add(int i, int j) {
		return i + j;
	}

	public default void m1() {
		System.out.println("interface my Interface");
	}
}
