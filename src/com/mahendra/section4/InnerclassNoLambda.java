package com.mahendra.section4;

public class InnerclassNoLambda {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("In myThread" + i);
				}
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("In main" + i);
		}
	}

}
