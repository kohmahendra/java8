package com.mahendra.section2;

public class Class7 {

	public static void main(String[] args) {
		ParentInterface p1= ()->System.out.println("Hello World");
		p1.test();
		
		ChildInterface p2= ()->System.out.println("Hello World");
		p2.test();
	}

}
