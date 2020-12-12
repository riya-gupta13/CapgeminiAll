package com.cpg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cpg.inherit.ContractEmployee;
import com.cpg.inherit.Employee;
import com.cpg.inherit.RegularEmployee;

public class TestInheritance {
	
	private EntityManager em;

	@Before
	public void setUp() {
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("test");
	
//		Create EntityManager
		em = emf.createEntityManager();
	}

	@Test
	public void testAddEmployees() {
		Employee e = new Employee("Empl", "Kumar");
		Employee e2 = new ContractEmployee("Contract", "Kumar", 200.00);
		Employee e1 = new RegularEmployee("Regular", "Gupta", 20000.00);
		//em.persist
		em.getTransaction().begin();
		
		em.persist(e);
		em.persist(e1);
		em.persist(e2);
	
		em.getTransaction().commit();
		
			
	}
	
	//@Test
	public void testFindEmployees() {
		
		Employee emp = em.find(Employee.class, 22);
		System.out.println(emp);
		
			
	}
	

	@After
	public void destroy() {
		em.close();
	}

}