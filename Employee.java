package com.corejava.fileio;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String empName;
	private int empSal;
	private String empDesc;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDesc=" + empDesc
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Employee(int empId, String empName, int empSal, String empDesc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesc = empDesc;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
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

	public String getEmpDesc() {
		return empDesc;
	}

	public void setEmpDesc(String empDesc) {
		this.empDesc = empDesc;
	}

}
