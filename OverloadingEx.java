package com.corejava.oops;

public class OverloadingEx {

	public void add(int a, int b) {

		System.out.println("addition of two numbers : " + (a + b));

	}

	public void add(int a, int b, int c) {

		System.out.println("addition of three numbers : " + (a + b + c ));

	}
//	public void add(float a, float b) {
//
//		System.out.println("addition of float  numbers : " + (a + b ));
//
//	}
	public void add(double  a, double b) {

		System.out.println("addition of int and float  numbers : " + (a + b ));

	}
	public void add(float a, int b) {

		System.out.println("addition of float and int numbers : " + (a + b ));

	}

	public static void main(String[] args) {
		OverloadingEx overl = new OverloadingEx();

		overl.add(10, 20,30);
		
		//overl.add(2.5f ,3.9f);
		
		overl.add(5, 1.2f);
		overl.add(5.4f , 2);
		
		overl.add('a','b'); // type promotion
		
		
		overl.add(2.3f , 2.6f);
		
		

	}

}
