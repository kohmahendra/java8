package com.mahendra.section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class16ArrayListSortLambda {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(12);
		numList.add(5);
		numList.add(5);
		numList.add(50);
		numList.add(1);
		numList.add(89);
		numList.add(32);

		System.out.println("Before Sorting:"+numList);
		Collections.sort(numList, (i1,i2) -> (i1>i2)?-1:(i1<i2)?1:0);
		System.out.println("After Sorting:"+numList);
		
		Collections.sort(numList, (i1,i2) -> (i1<i2)?-1:(i1>i2)?1:0);
		System.out.println("After Sorting:"+numList);
	}

}
