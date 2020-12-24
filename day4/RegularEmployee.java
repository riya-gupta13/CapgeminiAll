package day4;

public class RegularEmployee extends Employeee {
	
	public RegularEmployee(int id,String name,double salary) {
		super(id,name,salary);
		
	}
	
public void payBonus() {
	//double newsalary=0;
	this.salary+=((13*this.salary)/100);
		//System.out.println(newsalary);
	}

}
