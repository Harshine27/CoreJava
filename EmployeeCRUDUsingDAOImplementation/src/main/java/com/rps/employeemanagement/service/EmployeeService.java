package com.rps.employeemanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rps.employeemanagement.dao.EmployeeDAOI;
import com.rps.employeemanagement.entity.Employee;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI {
	@Autowired
	EmployeeDAOI dao;

	public String EmployeeCreation(Employee emp) {
		return dao.EmployeeCreation(emp);
	}

	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

	public String deleteById(int id) {
		return dao.deleteById(id);
	}

	public String UpdateEmployee(Employee emp) {
		return dao.UpdateEmployee(emp);
	}

}