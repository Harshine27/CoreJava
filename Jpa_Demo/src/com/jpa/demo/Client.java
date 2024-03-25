package com.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_crud");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin(); // operations started by EntityManager

		Employee emp = new Employee(100, "Harshine", 100000, "Trainer"); // inserting the data into object

		em.persist(emp); // inserting emp obj into employee(java class) table

		System.out.println("Data is inserted");

		Employee emp1 = em.find(Employee.class, 100);// select (select * from emp where empid = 100)

		System.out.println("Data is fetched from the database :" + emp1);

		emp.setEmpSal(1553661); // updating the empsalary

		em.merge(emp);
		
		System.out.println("updated data : " + emp);

		em.remove(emp); // deleting the emp data in the table

		em.getTransaction().commit();
		
		em.close();
		
		factory.close();

	}

}
