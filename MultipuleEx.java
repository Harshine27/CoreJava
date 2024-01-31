package com.corejava.oops;

class Parent3 {

	void m2() {

		System.out.println("this is from PArent3 m1 method");
	}
}

class Parent4 {

	void m1() {

		System.out.println(" this from PArent 4 m1 method");
	}
}

public class MultipuleEx extends Parent3,Parent4 { // getting error

	public static void main(String[] args) {

	}

}
