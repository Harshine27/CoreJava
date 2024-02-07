package com.corejava.oops;

class Private2 {

	private void m1() {

		System.out.println(" this is private method");

	}

}

public class Private1 extends Private2 {

	private int marks = 100;

	public static void main(String[] args) {

		Private1 p1 = new Private1();

		System.out.println(p1.marks);

		// p1.m1();

		Private2 p2 = new Private2();

		// p2.m1();

	}

}
