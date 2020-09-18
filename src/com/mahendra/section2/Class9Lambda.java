package com.mahendra.section2;


public class Class9Lambda {
	public static void main(String[] args) {
		Class9LambdaInterface c1 = (i,j)-> System.out.println("The sum is " + (i + j));;
		c1.add(12, 13);
		c1.add(155, 19);
	}

}

@FunctionalInterface
interface Class9LambdaInterface {
	public void add(int i, int j);
}
