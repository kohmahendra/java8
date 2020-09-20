package com.mahendra.section13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class ExampleOneFilterMap {
	public static void main(String[] args) {

		List<Integer> intList = getIntList();

		List<Integer> evenNumberList = null;
		List<Integer> doubleNumberList = null;

		/* before 1.8 : to get even numbers */
		evenNumberList = new ArrayList<Integer>();
		for (Integer i : intList) {
			if (i % 2 == 0) {
				evenNumberList.add(i);
			}
		}
		doubleNumberList = new ArrayList<Integer>();
		for (Integer i : intList) {
			doubleNumberList.add(i * 2);
		}
		System.out.println(evenNumberList);
		System.out.println(doubleNumberList);

		/* after 1.8 : to get even numbers */

		evenNumberList = intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumberList);

		doubleNumberList = intList.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(doubleNumberList);
	}

	public static List<Integer> getIntList() {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(0);
		intList.add(5);
		intList.add(10);
		intList.add(15);
		intList.add(20);
		intList.add(22);
		intList.add(28);
		intList.add(33);
		return intList;

	}
}
