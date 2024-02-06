package com.corejava.oops;

class SuperClass {

	int a = 345;
}

public class ThisSuperEx extends SuperClass {
	int a = 123; // current class variable

	void print() {

		int a = 234; // local variable

		System.out.println(a);
		
		System.out.println(this.a); // current variable
		
		System.out.println(super.a); // parent variable

	}

	public static void main(String[] args) {

		ThisSuperEx ts = new ThisSuperEx();
		
		ts.print();

	}

}
