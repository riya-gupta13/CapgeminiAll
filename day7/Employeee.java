package day7;

public class Employeee implements Comparable<Employeee>{
	
	Integer id;
	String name;
	Double salary;
	public Employeee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employeee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employeee o) {
//		if(this.id<o.id) {
//			return -1;
//		}
//		else if(this.id == o.id) {
//			return 0;
//		}
//		else {
//			return 1;
//		}
		if(this.id.equals(o.id)) {
			return this.name.compareTo(o.name);
		}
		
		return this.id.compareTo(o.id);
	
	}
	public void incrementSalary() {
		// deliberate delay
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.salary *= 1.1;
	}
	
	
	

}