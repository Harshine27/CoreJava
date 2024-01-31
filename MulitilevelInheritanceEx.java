package com.corejava.oops;

class SuperParent {

	int division(int a, int b) {

		System.out.println("this is divison from SuperParent class");
		return a / b;

	}
}

class Parent1 extends SuperParent {
	int multiplication(int a, int b) {

		System.out.println("this is multiplication from Parent class");
		return a * b;

	}

}

public class MulitilevelInheritanceEx extends Parent1 { // child

	int addition(int a, int b) {

		System.out.println("this is  addition method from child class");

		return a + b;

	}

	public static void main(String[] args) {
		MulitilevelInheritanceEx mi = new MulitilevelInheritanceEx();

		System.out.println(mi.addition(10, 20));
		System.out.println(mi.multiplication(50, 20));
		System.out.println(mi.division(10, 2));

	}

}
