package com.mahendra.section7;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		Function<Integer, Integer> times2 = e -> e * 3;

		Function<Integer, Integer> squared = e -> e * e;

		
		Integer result2 = times2.andThen(squared).apply(4); //(4*3) and then square// Returns 144
		System.out.println(result2);
		
		
		Integer result = times2.compose(squared).apply(4); // (4*4) then multiply by 3 //// Returns 48		
		System.out.println(result);
		
		System.out.println("****************************************");
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);

		System.out.println("The Result of f1:" + f1.apply("abcdefghijkl"));
		System.out.println("The Result of f2:" + f2.apply("abcdefghijkl"));
		System.out.println("The Result of f1.andThen(f2):" + f1.andThen(f2).apply("abcdefghijkl"));
		System.out.println("The Result of f1.compose(f2):" + f1.compose(f2).apply("abcdefghijkl"));

	}

}
