package com.corejava.java8;

@FunctionalInterface

interface Lambda1 {

	void m1();

}

public class LamdaEx {

	public static void main(String[] args) {

		Lambda1 lam = () -> System.out.println("Hellooooooo!!");

		lam.m1();

	}

}
