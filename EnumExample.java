
public class EnumExample {

	enum Day {

		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,

	}

	public static void main(String[] args) {

		Day day = Day.FRIDAY;

		System.out.println(day);

		switch (day) {

		case SUNDAY:

			System.out.println("sunday");

			break;

		case MONDAY:

			System.out.println("monday");

			break;

//			case FRIDAY:
		//
//				System.out.println("friday");
		//
//				break;

		default:

			System.out.println("other day");

			break;
		}

	}

}
