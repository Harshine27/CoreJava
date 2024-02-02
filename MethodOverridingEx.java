package com.corejava.oops;

class Parent6 {

	int property() {
		return 1000000000;

	}

	public void wedding() {

		System.out.println("Thammanna");
	}

}

public class MethodOverridingEx extends Parent6 {
	@Override
	public void wedding() {

		System.out.println("Keerthi Suresh");
	}

	public static void main(String[] args) {
		MethodOverridingEx ovr = new MethodOverridingEx();
		ovr.wedding();

	}

}
