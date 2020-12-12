package com.workoutTracker.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.ManyToAny;

@Entity 
//@Table(uniqueConstraints={@UniqueConstraint(columnNames={"email"})})
public class User
{	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="EMAIL",unique=true)
	private String email;
	private String password;
	
	private int height;
	private int weight;
	@Enumerated(EnumType.STRING)
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Role role;
	
	public User() { 
		super();
	}
	public User( String email, String password,  int height, int weight,Role role) {
		super();
		//this.id = id;
		this.email = email;
		this.password = password;
		this.height = height;
		this.weight = weight; 
		this.role=role;
	}  
	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User_user [email=" + email + ", password=" + password + ", height=" + height + ", weight=" + weight
				+ "]";
	}
	
	
}