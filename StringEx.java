package com.corejava.string;

public class StringEx {

	public static void main(String[] args) {

		String name = "welcome";
         // + , concat()
		name.concat(" to india");
        //System.out.println(name.concat(" to india")); 
		//System.out.println(name);
		
		// by using literal
		
		String name1 = "welcome";
		String name2 = "welcome";
		System.out.println(name1 == name2); // true
		System.out.println(name1.equals(name2)); // true
		System.out.println(name1.compareTo(name2));
		
		
		// by using new keyword
		
		String name3 = new String("Abple");
		String name4 = new String("bcple");
		System.out.println(name3 == name4); // memory reference
		System.out.println(name3.equals(name4)); // true
		System.out.println(name3.compareTo(name4)); // values
		System.out.println(name3.charAt(0));
		
		// by using StringBuffer
		
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");
		sb1.append("Core");
		System.out.println(sb1);
		System.out.println(sb1 == sb2 ); // false
		System.out.println(sb1.equals(sb2)); // false 
		
		
	}

}
