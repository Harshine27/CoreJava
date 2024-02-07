package com.corejava.oops;

class Protected2{
	
	protected void hello() {
		
		System.out.println("this is protected method frrom protected2 class ");
	}
	
}

public class Protected1  extends Protected2 {

	protected int marks = 100;

	public static void main(String[] args) {
		
		Protected1 pro1 = new Protected1();
		
		System.out.println(pro1.marks);
		
		pro1.hello();
		
		

	}

}
