import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter a choose day : ");
		
		int day = scan.nextInt();

		switch (day) {

		case 1:

			System.out.println(" Monday");

			break;

		case 2:
			
			System.out.println(" Tuesday");
			
			break;

		case 3:
			
			System.out.println(" wednesday");
			
			break;

		case 4:
			
			System.out.println(" Thursday");
			
			break;

		case 5:
			
			System.out.println(" Friday");
			
			break;

		case 6:
			
			System.out.println(" saturday");
			
			break;

		}

		System.out.println("ends for switch statemnt");
	}

}
