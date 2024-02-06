package com.corejava.oops;


final  class Age{// we cannot extend properties from final classes
	
	final   void changeAge(int age) { // parameterized method(before method overridding is not possible)
		 System.out.println(age += 1);
		 
	 }
	
}

public class FinalEx extends Age  { 
	@Override
	 void changeAge(int age) { // parameterized method
		 System.out.println(age -= 1);
		 
	 }
	
	public static void main(String[] args) {
//		 final int age = 25; //  we cannot change the values to the variables
//		 System.out.println(age += 1 ); // age = age + 1 
		FinalEx fi = new FinalEx();
		fi.changeAge(25);
		

	}

}
