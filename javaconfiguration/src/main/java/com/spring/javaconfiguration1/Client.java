package com.spring.javaconfiguration1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.javaconfiguration1")
public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Client.class);

		Employee employee = (Employee) context.getBean("emp");

		Address address = (Address) context.getBean("add");

		employee.setAddress(address);
		employee.setEmpId(101);
		employee.setEmpName("Harshine");
		address.setHno(125);
		address.setCity("hyderabad");

		System.out.println(employee);

	}

	@Bean("emp")//<bean>
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setAddress(getAddress());
		return employee;
	}

	@Bean("add")
	public Address getAddress() {

		return new Address();
	}

}
