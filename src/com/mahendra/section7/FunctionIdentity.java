package com.mahendra.section7;

import java.util.function.Function;

public class FunctionIdentity {
	public static void main(String[] args) {
		Function<String, String> fId = Function.identity();
		String output = fId.apply("Test case");
		System.out.println(output);

	}
}
