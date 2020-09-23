package com.mahendra.section11;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ExampleThree {

	public static void main(String[] args) {
		java.util.function.ToIntFunction<String> strLength = (s) -> s.length();
		System.out.println(strLength.applyAsInt("Hello World!"));

		java.util.function.IntToDoubleFunction sqrtFunc = (s) -> Math.sqrt(s);
		System.out.println(sqrtFunc.applyAsDouble(18));

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));
		
		UnaryOperator<Integer> f2=i->i*i;
		System.out.println(f2.apply(6));
		
		BiFunction<String,String,String> f3=(s1,s2)->s1+s2;
		System.out.println(f3.apply("Hello","World!"));

	}	

}
