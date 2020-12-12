package com.cpg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	int age;
	double fees;
	
	public Student() {
		
	}
	public Student(String name, int age, double fees) {
		super();
		this.name = name;
		this.age = age;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", fees=" + fees + "]";
	}
	

}
