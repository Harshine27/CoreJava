package com.corejava.oops;

public class EmployeeEncapsulation {

	private int empId;

	private String empName;

	private int empSal;

	private String empDesg;
	
	public EmployeeEncapsulation() { // ctrl + s
		
	}
	
	

	@Override
	public String toString() { // right click + source + generates toString()
		
		return "EmployeeEncapsulation [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDesg="
				+ empDesg + "]";
	}

	public int getEmpId() {
		
		return empId;
	}

	public EmployeeEncapsulation(int empId, String empName, int empSal, String empDesg) { //source  + generates constructor using fileds
		
		super();
		
		this.empId = empId;
		
		this.empName = empName;
		
		this.empSal = empSal;
		
		this.empDesg = empDesg;
	}



	public void setEmpId(int empId) { // right click + source + generates setters and getters
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

}
