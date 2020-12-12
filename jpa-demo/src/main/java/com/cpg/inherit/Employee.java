package com.cpg.inherit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="EMP")
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="EMP_INHERIT")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String lastName;
	
	
	public Employee() {
		
	}
	public Employee( String name, String lastName) {
		super();
//		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	public Employee( int id, String name, String lastName) {
		this(name, lastName);
		this.id = id;
//		this.name = name;
//		this.lastName = lastName;
//		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}


}