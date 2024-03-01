package com.corejava.collections;

import java.util.Vector;

public class LinkedListEx {

	public static void main(String[] args) {

		// LinkedList al = new LinkedList(); // 10 ,16,25 (curent capcity*3/2) +
		// 1--(10*3/2 + 1)

		Vector al = new Vector();

		al.add("Harshine");
		al.add(100);
		al.add(true);
		al.add(25.6f);
		al.add("divya");
		al.add("Harshine");
		System.out.println(al);

	}

}
