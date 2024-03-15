package com.corejava.java8;

import java.time.LocalDateTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println(dt);
		
		LocalDateTime  dt1 = LocalDateTime.of(1999,7,27,2,20,9);
		
		System.out.println(dt1);
		
		System.out.println("After six months:" + dt1.plusMonths(6));
		
		System.out.println("Before six months:" + dt1.minusMonths(6)); 
		
		

	}

}
