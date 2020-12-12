package com.cpg.compose;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity(name="StudentCompose")
@Table(name="Student_Compose")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	int age;
	double fees;
	//@OneToOne(cascade = CascadeType.ALL)
	//CousresEnrolled course;
	@OneToMany(cascade = CascadeType.ALL)
	List<CousresEnrolled> courses;
	
	
	public Student() {
		
	}
	
	public Student(String name, int age, double fees, List<CousresEnrolled> courses) {
		super();
		this.name = name;
		this.age = age;
		this.fees = fees;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public List<CousresEnrolled> getCourses() {
		return courses;
	}

	public void setCourses(List<CousresEnrolled> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", fees=" + fees + ", courses=" + courses
				+ "]";
	}

	/*public CousresEnrolled getCourse() {
		return course;
	}

	public void setCourse(CousresEnrolled course) {
		this.course = course;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", fees=" + fees + ", course=" + course + "]";
	}*/
	
	

	

}
