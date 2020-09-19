package com.mahendra.section6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		System.out.println("Names start with J");
		Predicate<String> startsWithPredicate = c -> (c.startsWith("J"));
		// OR
		// Predicate<String> collectionPredicate = c -> (c.charAt(0)=='J');
		List<String> namesList = new ArrayList<String>();
		namesList.add("John");
		namesList.add("Jimmy");
		namesList.add("Mahendra");
		namesList.add("Allison");
		namesList.add("William");
		namesList.add("Jack");

		for (String s : namesList) {
			if (startsWithPredicate.test(s)) {
				System.out.println(s);
			}
		}

		System.out.println("===============================================");

		String[] names = { "John", "Jimmy", null, "", "Mahendra", "Allison", null, "William", "Jack" };
		Predicate<String> isNullPredicate = c -> (c!=null && !"".equals(c));
		for (String s : names) {
			if (isNullPredicate.test(s)) {
				System.out.println(s);
			}
		}

	}

}
