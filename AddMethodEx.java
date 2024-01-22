
public class AddMethodEx {

	public int addition(int a, int b) { // instance method it returns int type
		return a + b;

	}

	public static void main(String[] args) {
		System.out.println("this is main method");
		AddMethodEx obj = new AddMethodEx();
		System.out.println(obj.addition(100, 52));
		System.out.println(obj.addition(12, 52));
		System.out.println(obj.addition(100, 62));
		System.out.println(obj.addition(100, 152));

	}

}
