package com.mahendra.section13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleTwoFilterMap {
	public static void main(String[] args) {

		List<String> namesList = getNamesList();
		System.out.println(namesList);
		
		System.out.println("*********************filter****************************");
		
		List<String> mamesFilteredList = namesList.stream().filter(name -> name != null && name.length() > 3)
				.collect(Collectors.toList());
		System.out.println(mamesFilteredList);

		List<String> upperCaseNamesList = namesList.stream().map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(upperCaseNamesList);
		
		System.out.println("**********************count***************************");
		
		long noOfElements = namesList.stream().filter(name -> name != null && name.length() > 3).count();
		System.out.println(noOfElements);
		
		System.out.println("******************Default sorting*******************************");
		namesList
		.stream()
		.filter(name -> name != null && name.length() > 3)
		.map(String::toUpperCase)
		.sorted()
		.forEach(s1->System.out.println(s1));
		
		System.out.println("******************Default sorting*******************************");
		namesList
		.stream()
		.filter(name -> name != null && name.length() > 3)
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("***********************Customized sorting**************************");
		namesList
		.stream()
		.filter(name -> name != null && name.length() > 3)
		.map(String::toUpperCase)
		// .sorted((name1,name2)->name1.compareTo(name2)) asc
		// .sorted((name1,name2)->name2.compareTo(name1)) desc
		.sorted((name1,name2)->-name1.compareTo(name2)) // desc (see minus - sybmol)
		.forEach(System.out::println);
		
		System.out.println("***********************min max **************************");
		int minimum=getIntList()
		.stream()
		.min((val1,val2)->val1.compareTo(val2))
		.get();
		System.out.println("minimum "+minimum);
		int maximum=getIntList()
				.stream()
				.max((val1,val2)->val1.compareTo(val2))
				.get();
		System.out.println("maximum "+maximum);
		
		System.out.println("***********************toArray **************************");
		Integer[] intArr =getIntList()
				.stream()
				.toArray(Integer[]::new);
		System.out.println(intArr[2]);
		
		System.out.println("***********************group of values or arrays**************************");
		Stream<Integer> stream =Stream.of(1,2,3,4,5,6);
		stream.forEach(System.out::println);
		
		Integer abc[] = {10,11,2,56,99};
		Stream<Integer> stream2 =Stream.of(abc);
		stream2.forEach(System.out::println);
		
	}

	public static List<String> getNamesList() {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Steve");
		namesList.add("Tim");
		namesList.add("Lucy");
		namesList.add("Pat");
		namesList.add("Angela");
		namesList.add("Tom");
		return namesList;

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
