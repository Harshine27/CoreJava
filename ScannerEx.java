import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) { // ctrl + shift + o for importing

		Scanner scan = new Scanner(System.in); // java.util
		System.out.println("Enter a name : ");
		String name = scan.next();
		System.out.println("Enter a num : ");
		int number = scan.nextInt();
		System.out.println("name is : "  + name);
		System.out.println("num is :" + number);

	}

}
