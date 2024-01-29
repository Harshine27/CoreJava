
public class StaticEx {

	static int empId = 100;

	static {

		System.out.println("This is a static block");
		
		System.out.println("empid is : " + empId); // static block will get executed before the main methpd

	}

	public static void main(String[] args) {

		System.out.println("This is a main method");

	}

}
