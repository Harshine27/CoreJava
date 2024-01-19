// student 
public class VariableEx {
	
	static String colleage_name = "Colleage"; // static variables
	
	 long contact = 9898989898L; // instance variables
	
public static void main(String[] args) {
	
	String name = "divya";
	int age = 25;
	char gender = 'F'; // local variables
	
	System.out.println("Student name is : " + name);
	System.out.println("Student age is : " + age);
	System.out.println("Student gendr is : " + gender);
	
	 //classname objref = new classname();
	VariableEx var = new VariableEx(); // obj creation
	System.out.println(var.contact); // obj ref
	System.out.println(VariableEx.colleage_name);
	
}
}

// main----> ctrl + space 
// syso-----> ctrl+ space