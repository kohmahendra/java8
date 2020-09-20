package com.mahendra.section12;

public class MethodReferenceThread {
	public static void main(String[] args) {

		MethodReferenceThread methodReferenceThread = new MethodReferenceThread();
		Runnable r = methodReferenceThread::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("MethodReferenceThread.main():" + i);
		}

	}

	public void m1() {
		for (int i = 0; i < 100; i++) {
			System.out.println("MethodReferenceThread.m1():" + i);
		}
	}
}
