package com.jpa.jpaex;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test {

	public static void main(String[] args) {// class->Table;variables->columns;objects->rows

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Harshine");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee emp1 = new Employee(100, "Harshine", 50000);
		Employee emp2 = new Employee(200, "Divya", 70000);
		Employee emp3 = new Employee(300, "Prashanti", 80000);

		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);

		System.out.println("data inserted");

		Query query = em.createQuery("select e from Employee e");// select * from employee
		 //Query query=em.createQuery("find name");//named query

		List<Employee> emps = query.getResultList();
		for (Employee emp : emps) {
			System.out.println(emp);// get the all the emps data information
		}
		Query q = em.createQuery("update Employee set empsalary=empsalary+5000 where empsalary>50000");
		int result = q.executeUpdate();
		System.out.println(result + "records updated");// updating the records where empsalaray >50000

		Query q1 = em.createQuery("delete from Employee e where e.empsalary<60000");
		int result1 = q1.executeUpdate();
		System.out.println(result1 + " record deleted"); // delete the emp record(row) where empsal<60000

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
