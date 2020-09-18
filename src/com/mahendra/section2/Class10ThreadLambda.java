package com.mahendra.section2;

public class Class10ThreadLambda {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};

		Thread t = new Thread(r1);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
