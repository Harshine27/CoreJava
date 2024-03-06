package com.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
// values are overridden when we give keys duplicate
// duplicate values are allowed

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(101, "harshine");
		map.put(105, "divya");
		map.put(110, "harshine");
		map.put(800, "prashanti");
		map.put(105, "java");
		map.put(220, "divya");
		map.put(650, "Advanced");
		map.put(105, "corejava");
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//			
//			
//		}
//		
		
		while(itr.hasNext()) {
			
			int key = itr.next();
			System.out.println(key + ": " + map.get(key));
			
			
		}
		
		System.out.println("******************************************");
		
		Set<Entry<Integer,String>> entries = map.entrySet();
		
		Iterator<Entry<Integer,String>> itr1 = entries.iterator();
		
		while(itr1.hasNext()) {
			
			Entry<Integer,String> entry = itr1.next();
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
			
			
			
		}
		

	}

}
