package com.corejava.arrays;

public class ArrayEx3 {

	public static void main(String[] args) {

		// int[][] array1 = new int[2][3];

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(array1[0][1]);

		System.out.println(array1[1][0]);

		for (int i = 0; i < array1.length; i++) {// rows 123 ----456 -----789
			
			for (int j = 0; j < array1.length; j++) {// columns
				
				System.out.println(array1[i][j]); // 00--1 01 --2 02 ---3 //10 ---4 11---5 ---12 --6//20 21 22 ---7 8 9 

			}

		}
	}

}
