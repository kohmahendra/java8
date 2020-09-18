package com.mahendra.section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class16ArrayListSortNoLambda {

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
		Collections.sort(numList,new MyComparator());
		System.out.println("After Sorting:"+numList);
	}

}

class MyComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		/*if (I1 < I2) {
			return +1;
		} else if (I1 > I2) {
			return -1;
		} else {
			return 0;
		}*/
		
		return (i1>i2)?-1:(i1<i2)?1:0;
	}
}