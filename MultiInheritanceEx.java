package com.corejava.oops;

interface A {
	void m1();

}

interface B {

	void m1();
}

public class MultiInheritanceEx implements A, B {

	public static void main(String[] args) {
		MultiInheritanceEx mi = new MultiInheritanceEx();
		mi.m1();
	}

	@Override
	public void m1() {
		int a = 10;
		int b = 5;
		System.out.println(a / b);

	}

}
