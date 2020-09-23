package com.mahendra.section11;

import java.util.function.IntPredicate;

public class ExampleTwo {

	public static void main(String[] args) {
		int num[] = { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		IntPredicate p = (k) -> k % 2 == 0;
		for (int i = 0; i < num.length; i++) {
			if (p.test(i)) {
				System.out.print(num[i] + " ");
			}
		}

	}

}
