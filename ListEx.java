package com.corejava.collections;

import java.util.ArrayList;
//1.both homogenous/ hetrogenous data can be stored
//
//2.collections are not fixed in size nothing growable in nature
//
//3.utility methods 
//list
//.duplicates are allowed
// insertion order is preserved

public class ListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // 10 ,16,25 (curent capcity*3/2) + 1--(10*3/2 + 1)

		al.add("Harshine");
		al.add(100);
		al.add(true);
		al.add(25.6f);
		al.add("divya");
		al.add("Harshine");

		System.out.println(al);

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Divya");

		al1.add("Harshine");
		al1.add("Prashanti");
		al1.add("core java");
		al1.add("Divya");

		System.out.println(al1);

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Advanced");
		al2.add("java");
		al2.addAll(al1);
		// al2.remove("java");
		System.out.println(al2);
		al2.removeAll(al1);
		System.out.println(al2);

	}

}
