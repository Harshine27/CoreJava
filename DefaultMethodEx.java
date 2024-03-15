package com.corejava.java8;

interface Test {

	void absMethod();

	default void m1() {

		System.out.println("Default method");
	}

	

}

public class DefaultMethodEx implements Test {

	public static void main(String[] args) {
		
		DefaultMethodEx def = new DefaultMethodEx();

		def.absMethod();

		def.m1();

	}

	@Override
	public void absMethod() {
		
		System.out.println("this is abstract method implementation");
	}

}
