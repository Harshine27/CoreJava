import java.util.Scanner;

public class NestedIfEx {

	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in); // java util

		System.out.println("Enter a country: "); // 5==5

		String country = scan.next();

		if (country.equals("india")) {

			System.out.println(" enter a city: ");

			String city = scan.next();

			if (city.equals("Delhi")) {

				System.out.println("Welcome to delhi");

			} else if (city.equals("Hyderabad")) {

				System.out.println("welcome to hyderanbad");
			} else {

				System.out.println(" othes parts of india");
			}

		}
		System.out.println(" not india");
	}

}
