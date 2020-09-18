package com.mahendra.section2;

public class Class8Lambda {

	public static void main(String[] args) {
		Test2 t1 = () -> System.out.println("Hello World");
		t1.m1();
	}

}

interface Test2 {
	public void m1();
}