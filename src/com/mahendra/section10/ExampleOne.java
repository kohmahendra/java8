package com.mahendra.section10;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class ExampleOne {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bpi = (i,j)-> i%2==0 &&j%2==0;
		System.out.println(bpi.test(4, 6));
		
		BiFunction<Integer, Integer,Integer> bfu =(i,j) -> {return i*j;};
		System.out.println(bfu.apply(4, 6));
		
		BiConsumer<Integer, Integer> bc =(i,j) -> System.out.println(i*j);
		bc.accept(4, 6);
		
		// There is No BiSupplier, as we dont have any inputs
	}

}
