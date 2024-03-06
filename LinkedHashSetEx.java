package com.corejava.collections;

import java.util.LinkedHashSet;

// duplicates are not allowed
// insertion order is preserved

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("harshine");
		set.add("divya");

		set.add("harshine");

		set.add("prashanti");

		set.add("java");
		
		System.out.println(set);


	}

}
