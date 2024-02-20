package com.corejava.exceptions;

public class Exception2 {

	public static void main(String[] args) {
		
		try {
			
			int a = 10;
			
			int b = 0;
			
		    int c = a/b;
			
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("don't enter denominator ass zero");
			
			System.out.println(e);
			
			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
		}
		
		try {
			
			int a[] = new int[5];
			
			a[0] =1;
			
			a[5] = 10;
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("array index max is 4 ");
			
			
		}
		
		System.out.println("remaining lines of code");
		
	}

}
