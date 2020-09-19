package com.mahendra.section6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {

		Predicate<String> strLengthPredicate = v1 -> (v1.length() > 5);
		System.out.println(strLengthPredicate.test("Hello World!"));
		System.out.println(strLengthPredicate.test("Hello"));

		System.out.println("=========================");
		Predicate<Integer> intGrtPredicate = v1 -> (v1 >= 10);
		System.out.println(intGrtPredicate.test(12));
		System.out.println(intGrtPredicate.test(2));

		System.out.println("=========================");

		Predicate<Collection<String>> colectionPredicate = c -> (c.isEmpty());

		List<String> namesList1 = new ArrayList<String>();
		System.out.println(colectionPredicate.test(namesList1));
		List<String> namesList2 = new ArrayList<String>();
		namesList2.add("John");
		System.out.println(colectionPredicate.test(namesList2));

		System.out.println("************************** Predicate Joining **************************");
		System.out.println("==========and===============");
		Predicate<Integer> intGrtThan10Predicate = v1 -> (v1 >= 10);
		Predicate<Integer> isEvenPredicate = v1 -> (v1 % 2 == 0);

		System.out.println(intGrtThan10Predicate.and(isEvenPredicate).test(64));
		System.out.println(intGrtThan10Predicate.and(isEvenPredicate).test(65));

		System.out.println("==========or===============");
		System.out.println(intGrtThan10Predicate.or(isEvenPredicate).test(64));
		System.out.println(intGrtThan10Predicate.or(isEvenPredicate).test(5));

		System.out.println("==========negate===============");
		System.out.println(intGrtThan10Predicate.negate().test(5));
		System.out.println(intGrtThan10Predicate.negate().test(90));

		System.out.println("==========isEqual===============");
		Predicate<String> i = Predicate.isEqual("Hello");
		System.out.println(i.test("Hello"));
		System.out.println(i.test("World"));
	}

}
