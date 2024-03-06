package com.corejava.collections;

import java.util.TreeMap;
// it follows sorting order/ asscending order
// duplicate values are allowed 
// but duplicate keys are not allowed when we give duplicate keys they are overridden

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

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
