package com.corejava.arrays;

public class ArrayEx1 {

	public static void main(String[] args) {

		String[] name = { "harshine", "divya", "prashanti" };

		name[2] = "java";

		System.out.println(name);

		System.out.println(name[2]);

		System.out.println("enter an array name");

		for (int i = 0; i < 3; i++) {

			System.out.println(name[i]);

		}

		for (String string : name) { // harshine, divya , prashanti

			System.out.println(string);

		}

		System.out.println("enter an array  names");

		String[] names = new String[3];

		for (int i = 0; i < 3; i++) {

			names[i] = "welcome";

		}
		for (String string : names) {

			System.out.println(string);

		}

	}

}
