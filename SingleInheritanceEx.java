package com.corejava.oops;

class Parent {

	int marks = 25;

	public void display() {

		System.out.println("this is a parent class method");

	}

}

public class SingleInheritanceEx extends Parent {

	void displayMsg() {

		System.out.println("this is my child class");

	}

	public static void main(String[] args) {

		SingleInheritanceEx obj = new SingleInheritanceEx();

		obj.displayMsg();

		obj.display();

		System.out.println("marks : " + obj.marks);

	}

}
