package com.corejava.oops;

class SuperClass1 {
	
	int a = 234;

	public SuperClass1() {
		
		System.out.println("default constructor of parent class");

	}

	public SuperClass1(int a) {
		
		System.out.println("paramerized constructor of parent class" + a);

	}

	public void m1() { // default method
		System.out.println("parent class m1 method");
	}

	public void m1(int x) { // parameterized method
		
		System.out.println("parent class m1 method");
	}
}

public class ThisSuperEx1 extends SuperClass1 {

	int a = 222;

	public ThisSuperEx1() { // default constructor

		super(45);// Constructor call must be the first statement in a constructor
		
		System.out.println("default constructor of child class");

	}

	public ThisSuperEx1(String name) { // parameterized constructor
		
		this();
		
		System.out.println(this); // obj ref

		System.out.println("default constructor of child class");

	}

	public void m1() {
		
		System.out.println(" child class m1 method");

	}

	public void display(int a) {
		
		this.m1();
		
		super.m1();

		System.out.println(a + " " + this.a + "  " + super.a);
	}

	public static void main(String[] args) {

		ThisSuperEx1 ts1 = new ThisSuperEx1();
		
		ThisSuperEx1 ts2 = new ThisSuperEx1("Divya");
		
		ts1.display(345);
		
		System.out.println(ts2);
		
		System.out.println(ts1);

	}

}
