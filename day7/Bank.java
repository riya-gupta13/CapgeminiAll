package day7;

import java.util.List;

public class Bank {
	String branch;
	float interest;
	String name;
	List<Branch> branches;
	
	
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public Bank(String branch, float interest, String name) {
		super();
		this.branch = branch;
		this.interest = interest;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bank [branch=" + branch + ", interest=" + interest + ", name=" + name + "]";
	}
	public Bank() {
		super();
	}
	
	

}
