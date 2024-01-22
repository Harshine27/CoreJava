
// parameterized and default
// static and instance
public class MethodEx {
	void displayMsg() { // default method and instance
		System.out.println("this is a default method");

	}

	public static String sayHi() { // static and default
		return "Hello Java";

	}

	public void show(String name, float marks) { // parameterized and instance method

		System.out.println("this is a parameterized method ");
		System.out.println("marks of " + name + ':' + marks);
	}

	public static void main(String[] args) {

		MethodEx obj = new MethodEx();
		obj.displayMsg();

		System.out.println(MethodEx.sayHi());
		obj.show("divya", 95);

	}

}
