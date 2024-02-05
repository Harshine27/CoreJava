package com.corejava.oops;

public class ConstructorEx3 {

	int id;
	
	String name;

	ConstructorEx3() { // default constructor

		System.out.println(" this is default consrtuctor");

	}

	ConstructorEx3(String n) { // single parameterized constructor

		name = n;

		System.out.println(" this is parameterized consrtuctor");

	}

	ConstructorEx3(int i, String n) { //  two parameterized constructor

		id = i;
		
		name = n;

		System.out.println("two parameterized constrcuors");
	}

	void display() {

		System.out.println(" id is :" + id + " and " + "name is " + name);
	}

	public static void main(String[] args) {
		
		ConstructorEx3 cons = new ConstructorEx3(); // default constructor

		ConstructorEx3 cons1 = new ConstructorEx3("Harshine"); // single parameter constructor

		ConstructorEx3 cons2 = new ConstructorEx3(101, "divya"); // two parameter constructor

		cons.display();

		cons1.display();

		cons2.display();

	}

}
