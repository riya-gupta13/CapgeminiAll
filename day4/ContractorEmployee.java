package day4;

public class ContractorEmployee extends Employeee {
	public ContractorEmployee(int id, String name,double salary) {
		super(id,name,salary);
	}
	public void payBonus() {
		//double newsalary=0;
		this.salary+=5000;
			//System.out.println(newsalary);
		}

}
