package com.corejava.oops;

public class Client {

	public static void main(String[] args) {

		EmployeeEncapsulation emp = new EmployeeEncapsulation();
		
		EmployeeEncapsulation emp1 = new EmployeeEncapsulation(121, "Divya", 500000, "Software Engineer");
		 
		emp.setEmpId(120);
		
		emp.setEmpName("Harshine");
		
		emp.setEmpSal(100000);
		
		emp.setEmpDesg("Trainer");

		System.out.println(emp.toString());
		
		System.out.println(emp1);
		
	}

}
