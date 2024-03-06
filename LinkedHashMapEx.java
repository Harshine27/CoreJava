package com.corejava.collections;

import java.util.LinkedHashMap;

// duplicates values are allowed
// insertion order is preserved

public class LinkedHashMapEx {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(101, "harshine");
		map.put(105, "divya");
		map.put(110, "harshine");
		map.put(800, "prashanti");
		map.put(105, "java");
		map.put(220, "divya");
		map.put(650, "Advanced");
		map.put(105, "corejava");
		
		System.out.println(map);

	}

}
