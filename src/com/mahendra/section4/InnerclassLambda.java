package com.mahendra.section4;

public class InnerclassLambda {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("In myThread" + i);
			}
		});

		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("In main" + i);
		}
	}
}
