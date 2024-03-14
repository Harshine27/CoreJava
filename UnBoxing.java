package com.corejava.java5;

public class UnBoxing {

	public static void main(String[] args) { // converting wrapper class object into the primitive data type
		
		
		Integer a = new Integer(10); // wrapper class object
		
	     int b = a; //passing the wrapper class object into primitive data type(unBoxing)
	     
	     System.out.println(a + " " + b);

	}

}
