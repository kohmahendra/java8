package com.mahendra.section2;

public class Class3 {

	public static void main(String[] args) {
		MyFunctionalInterface1 v1 = () -> System.out.println("Hello World!");
		v1.printIt();

		MyFunctionalInterface2 v2 = (i, j) -> i + j;
		int k = v2.add(23, 45);
		System.out.println(k);

		MyFunctionalInterface3 v3 = (str) -> str.length();
		int strLenth = v3.strLength("Hello");
		System.out.println(strLenth);

		MyFunctionalInterface3 v4 = s -> s.length();
		int strLenth2 = v4.strLength("Hello");
		System.out.println(strLenth2);

	}

	public void printIt() {
		System.out.println("Hello World!");
	}

	public int add(int i, int j) {
		return i + j;
	}
}

@FunctionalInterface
interface MyFunctionalInterface1 {
	public void printIt();

	public static void test() {
		System.out.println("Hello World!");
	}

	public static void test2() {
		System.out.println("Hello World!");
	}

	public default void test3() {
		System.out.println("Hello World!");
	}

	public default void test4() {
		System.out.println("Hello World!");
	}
}

@FunctionalInterface
interface MyFunctionalInterface2 {
	public int add(int i, int j);
}

interface MyFunctionalInterface3 {
	public int strLength(String input);
}