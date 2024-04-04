package com.rps.employeemanagement.dao;

import java.util.List;

import com.rps.employeemanagement.entity.Employee;

public interface EmployeeDAOI  {
//DATAJPA-->CrudRepository,JpaRepository
	String deleteById(int id);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int id);

	String EmployeeCreation(Employee emp);

	String UpdateEmployee(Employee emp);
}
