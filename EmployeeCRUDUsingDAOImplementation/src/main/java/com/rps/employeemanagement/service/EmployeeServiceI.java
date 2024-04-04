package com.rps.employeemanagement.service;

import java.util.List;

import com.rps.employeemanagement.entity.Employee;

public interface EmployeeServiceI {
	String deleteById(int id);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	String EmployeeCreation(Employee emp);

	String UpdateEmployee(Employee emp);
}
