package com.spring.mavenproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.spring.mavenproject")
public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Client.class);
		Employee employee = (Employee) context.getBean("emp");
		Address address = (Address) context.getBean("address");
		employee.setAddress(address);
		address.setCity("Hyd");
		address.setColony("vidya");
		employee.setEmpName("Divya");
		employee.setEmpId(122);
		System.out.println(employee);
		
	}

}
