package com.corejava.exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter first Num:");

		int firstNum = scan.nextInt();
		
		System.out.println("enter second num : ");
		
		int secondNum = scan.nextInt();
		
        try { // risky code
        	
		int result = firstNum / secondNum;

		System.out.println(result);
		
        } 
        catch(ArithmeticException e) {// handling the exception
        	
        	System.out.println("dont enter denominator as zero");
        }
        finally { // always executes
        	
        	System.out.println("exceutes everytime");
        }
        

		System.out.println("remamining lines of code");

	}

}
