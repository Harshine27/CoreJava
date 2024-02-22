package com.corejava.exceptions;

public class Exception3 {

	public static void main(String[] args) {

		try {

			int a[] = new int[5];

			a[4] = 50 / 2;

			String s = "Harshine";

			int x = Integer.parseInt(s);

		} catch (ArrayIndexOutOfBoundsException ae) {

			System.out.println("max size is 4");

		} catch (ArithmeticException e) {

			System.out.println("dont enter denominatora as zero");

		} catch (NumberFormatException e) {

			System.out.println("we canot convert string into integer");

		}

		catch (Exception ae) {

			System.out.println("unable to find length of the string");

		}

		finally {

			System.out.println("executes all the time");
		}

		System.out.println("remaing lines of code");
	}

}
