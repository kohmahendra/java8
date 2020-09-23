package com.mahendra.section7;

import java.util.function.Function;

public class FunctionExampleOne {

	public static void main(String[] args) {
		Function<String, Integer> lengthOfStringFunction = s -> s.length();
		Integer length = lengthOfStringFunction.apply("Hello World!");
		System.out.println(length);

		Function<Integer, Integer> squareOfFunction = i -> i * i;
		System.out.println(squareOfFunction.apply(25));

		Function<String, String> trimString = s -> s == null ? s : s.trim();
		System.out.println(trimString.apply("        Hello World!    "));

		Function<String, String> removeSpaces = s -> s == null ? s : s.replaceAll(" ", "");
		System.out.println(removeSpaces.apply("        Hello World!    "));
		System.out.println("*************************************************************************");

	}

}
