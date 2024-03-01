package com.corejava.collections;

import java.util.HashSet;
//1.both homogenous/ hetrogenous data can be stored
//
//2.collections are not fixed in size nothing growable in nature
//
//3.utility methods 
//set
//1.duplicates are not allowed
// insertion order not allowed
public class SetEx {

	public static void main(String[] args) {
		
      HashSet set = new HashSet();
      set.add("harshine");
      set.add("divya");
      set.add("java");
      set.add("prashanti");
      set.add("harshine");
      set.add(27);
      set.add(true);
      System.out.println(set);
      
      
	}

}
