package day4;

public class Employeee {
	int id;
	String name;
	double salary;
	
	public Employeee() {
		super();
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	/*public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}*/
	public Employeee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employeee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void payBonus() {
		
	}
	

}
