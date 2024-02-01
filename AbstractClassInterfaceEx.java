package com.corejava.oops;

interface SuperParent1 {

	abstract void display();
}

abstract class AParent implements SuperParent1 {
	void m2() { // concrete method

		System.out.println("this is my m2 method");
	}

	abstract void m3(); // abstract method

}

public class AbstractClassInterfaceEx extends AParent {

	void m1() {
		System.out.println("this is my m1 method");

	}

	public static void main(String[] args) {
		AbstractClassInterfaceEx ai = new AbstractClassInterfaceEx();
		ai.m1();
		ai.m2();
		ai.m3();
		ai.display();

	}

	@Override
	void m3() {
		System.out.println("this is unplemented method of AParent");

	}

	@Override
	public void display() {
		System.out.println("this is unplemented method of SuperParent1");

	}

}
