package com.cpg.compose;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CousresEnrolled {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String courseName;
	String duration;
	double amount;
	public CousresEnrolled() {
		
	}
	public CousresEnrolled(String courseName, String duration, double amount) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.amount=amount;
	}
	@Override
	public String toString() {
		return "CousresEnrolled [id=" + id + ", courseName=" + courseName + ", duration=" + duration + ", amount="
				+ amount + "]";
	}
	

}
