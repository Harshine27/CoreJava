
public class CommandLineArgEx {

	public static void main(String[] args) {

		String name = args[0];
		
		int i = Integer.parseInt(args[1]);
		
		int j = Integer.parseInt(args[2]);
		
		float f = Float.parseFloat(args[3]);
		
		boolean b = Boolean.parseBoolean(args[4]);
		
		int sum = i + j;
		
		System.out.println(sum);
		
		System.out.println(f);
		
		System.out.println(b);

	}

}
