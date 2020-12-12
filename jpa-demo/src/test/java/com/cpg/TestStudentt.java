package com.cpg;

import static org.junit.Assert.*;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.After;
import org.junit.Before;

import com.cpg.Student;
public class TestStudentt {
	
	private EntityManager em;

	@Before
	public void setUp() {
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("test");
	
//		Create EntityManager
		em = emf.createEntityManager();
	}

//	@Test
	public void testAddStudent() {
		//Student s1=new Student("Riya", 24, 30000.0);
		//Student s2=new Student("Rifka", 23, 25000.0);
		//Student s3=new Student("Ridhii", 24, 35000.0);
		//Student s4=new Student("Somss", 25, 40000.0);
		Student s1=new Student("Riya", 24, 30000.0);
		Student s2=new Student("Pratima", 26, 45000.0);
		Student s3=new Student("Mahi", 24, 30000.0);
		Student s4=new Student("Akii", 25, 40000.0);
		
		em.getTransaction().begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.getTransaction().commit();
	}
	
	//@Test
	public void findStudentByName() {
		TypedQuery<Student> foundStudent=em.createQuery("SELECT s from Student s where name=:std", Student.class);
		 foundStudent.setParameter("std", "Riya");
		 Student student= foundStudent.getSingleResult();
		 System.out.println(student);
		
	}
	
	//@Test
	public void removeStudentById() {
		em.getTransaction().begin();
		Student std=em.find(Student.class, 10);
		em.remove(std);
		em.getTransaction().commit();
	}
	
//	@Test
	public void countStudents() {
		//TypedQuery<Long> query = em.createNamedQuery("selectCount", Long.class);
		TypedQuery<Long> stdquery=em.createQuery("SELECT count(s) from Student s", Long.class);
		Long count=stdquery.getSingleResult();
		System.out.println(count);
	}
	
	@Test
	public void findMaxFees() {
		TypedQuery<Double> maxquery=em.createQuery("SELECT max(s.fees) from Student s", Double.class);
		Double max=maxquery.getSingleResult();
		System.out.println(max);
	}
	
	
	@After
	public void destroy() {
		em.close();
	}

	

}
