package com.corejava.oops;


class Parent2{
	
	void parentMethod() {
		
		System.out.println("this is parent method");
	}
	
}


class Child1 extends Parent2{
	
	void childMethod1() {
		
		System.out.println("this is child1 method");
	}
	
}

public class HiraricalInheritanceEx extends Parent2 {
	
	  void childMethod2() {
		  
		  System.out.println("this is child2 method");

	  }

	public static void main(String[] args) {
		
		HiraricalInheritanceEx hi = new HiraricalInheritanceEx();

		hi.childMethod2();
		hi.parentMethod();
		Child1 ch = new Child1();
		ch.childMethod1();
		ch.parentMethod();
		
	}

}
