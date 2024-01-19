
public class LossyEx {
	public static void main(String[] args) {
		byte n1 = 100; // -128 to 127
		byte n2 = 50;
		
		byte sum = (byte) (n1+n2);
		System.out.println(sum); // lossy conversion
	}

}
