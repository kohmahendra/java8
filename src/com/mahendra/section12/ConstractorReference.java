package com.mahendra.section12;

public class ConstractorReference {
	public static void main(String[] args) {
		// MyInterface2 myInterface2 = () -> new TestClass();
		// myInterface2.get();

		MyInterface2 myInterface2 = TestClass::new;
		myInterface2.get();

	}

	public void m2() {
		System.out.println("MethodReference.m2()");
	}
}

class TestClass {
	public TestClass() {
		System.out.println("TestClass constructor");
	}
}

interface MyInterface2 {
	public TestClass get();
}
