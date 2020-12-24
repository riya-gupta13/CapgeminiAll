package day10;

public class Problem1Employee{
	String name;
	Integer salary;
	
	public Problem1Employee(String name, int salary) {
		super();
		this.name=name;
		this.salary=salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
}


