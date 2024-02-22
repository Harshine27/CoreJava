package com.corejava.exceptions;

public class Exception4 {

	public static void main(String[] args) {
		try {

			int x = 12 / 2;

			try {

				int b = 40 / 2;

				try {

					int a[] = new int[5];

					a[5] = 4;
				}

				finally {

					System.out.println("inner try block");
				}

				System.out.println("remaining try statements");

			} catch (ArithmeticException e) {

				System.out.println("dont enter denminator as zero");

			}

			catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("max size is 4");

			}
		} catch (Exception e) {

			System.out.println("handles all exceptions");

		}

		finally {

			System.out.println("Excecutes everytime");
		}

		System.out.println("reaming lines of code normal termination");

	}

}
