package com.cpg;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cpg.compose.CousresEnrolled;

// import com.cpg.compose.Employee;

import com.cpg.compose.Student;

public class TestStudentComposition {
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
	public void testAddCourses() {
		CousresEnrolled course=new CousresEnrolled("English", "10 days", 10000);
		CousresEnrolled course2=new CousresEnrolled("Maths", "15 days", 15000);
		List<CousresEnrolled> courses=new ArrayList<CousresEnrolled>();
		courses.add(course);
		courses.add(course2);
		Student s=new Student("Riya",24,25000,courses);
		//Student s2=new Student("Rifka", 23, 25000.0, course);
		//Student s3=new Student("Ridhii", 24, 35000.0, course);
		//Student s4=new Student("Somss", 25, 40000.0, course);
		//Student s5=new Student("Rishh", 24, 30000.0, courses);
		//Student s6=new Student("Pratima", 26, 45000.0, courses);
		//Student s7=new Student("Mahi", 24, 30000.0, course);
		//Student s8=new Student("Akii", 25, 40000.0, course);
		em.getTransaction().begin();
		em.persist(s);
		//em.persist(s5);
		//em.persist(s6);
		em.getTransaction().commit();
	}
	
	@Test
	public void testFindStudents() {
		Student std = em.find(Student.class, 26);
		System.out.println(std);
		System.out.println(std.getCourses());		
	}
	@After
	public void destroy() {
		em.close();
	}

}
