package com.mahendra.section2;

public class Class9NoLambda {
	public static void main(String[] args) {
		Class9NoLambdaInterface c1 = new Class9NoLambdaInterfaceImpl();
		c1.add(12, 13);
	}

}

interface Class9NoLambdaInterface {
	public void add(int i, int j);
}

class Class9NoLambdaInterfaceImpl implements Class9NoLambdaInterface {
	@Override
	public void add(int i, int j) {
		System.out.println("The sum is " + (i + j));
	}
}