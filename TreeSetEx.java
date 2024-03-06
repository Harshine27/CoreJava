package com.corejava.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
// Alphabetical order or sorting order
// duplicates not allowed

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("divya");
		names.add("harshine");
		names.add("prashanti");
		names.add("java");
		names.add("divya");
		
		System.out.println(names);
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
			
			
		}
		
		class ReverseOrder implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				
				//return  -o1.compareTo(o2);
				return  o2.compareTo(o1);
			}
			
			
			
		}
		TreeSet<String> names1 = new TreeSet<String>(new ReverseOrder());
		
		names1.add("divya");
		names1.add("harshine");
		names1.add("prashanti");
		names1.add("java");
		names1.add("divya");
		
		System.out.println(names1);
		
		
		Iterator itr1 = names1.iterator();
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
			
			
			
		}
		
		
		
		
		
		

	}

}
