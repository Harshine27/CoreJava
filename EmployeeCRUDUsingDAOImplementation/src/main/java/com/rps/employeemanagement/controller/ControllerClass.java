package com.rps.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rps.employeemanagement.entity.Employee;
import com.rps.employeemanagement.service.EmployeeServiceI;

@RestController
@RequestMapping("/employees") // insert -->post,put,delete,get
public class ControllerClass {
	@Autowired
	EmployeeServiceI serviceobj;

//Create Employee
	@PostMapping("/EmployeeCreation") // http://localhost:2344/employees/EmployeeCreation
	public ResponseEntity<String> EmployeeCreation(@RequestBody Employee emp) {
		String message = serviceobj.EmployeeCreation(emp);// persist(emp)
		return new ResponseEntity<String>(message, new HttpHeaders(), HttpStatus.OK);//200
	}
//	{                                 //http://localhost:portno/classlevelurl/methodlevelurl
//		"id":127,
//		"name":"manas",
//		"salary":80500,
//		"phonenumber":565656,
//		"company":"ibm"
//
//		}

//Get Particular Employee Data
	@GetMapping("/GetEmployee/{id}") // http://localhost:2344/employees/GetEmployee/123
	private ResponseEntity<Employee> getEmployee(@PathVariable("id") int id) {
		Employee e = serviceobj.getEmployeeById(id);// find(123)
		return new ResponseEntity<Employee>(e, new HttpHeaders(), HttpStatus.OK);
     
	}

//Get All Employees Data
	@GetMapping("/GetAllEmployees") // http://localhost:8586/employees/GetAllEmployees
	private ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> emplist = serviceobj.getAllEmployee();//
		return new ResponseEntity<List<Employee>>(emplist, new HttpHeaders(), HttpStatus.OK);

	}

//Updating Employee data
	@PutMapping("/UpdateEmployee")//		

	public ResponseEntity<String> UpdateEmployee(@RequestBody Employee emp)// 123
	{
		String message = serviceobj.UpdateEmployee(emp);
		return new ResponseEntity<String>(message, new HttpHeaders(), HttpStatus.OK);
	}

//Deleting Employee
	//@RequestMapping("/DeleteEmployee/{id}",methodtype=Method.DELETE)
	@DeleteMapping("/DeleteEmployee/{id}")
	private ResponseEntity<String> delEmp(@PathVariable("id") int id) {
		String message = serviceobj.deleteById(id);
		return new ResponseEntity<String>(message, new HttpHeaders(), HttpStatus.OK);
	}

}
