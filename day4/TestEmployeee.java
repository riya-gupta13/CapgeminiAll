package day4;

public class TestEmployeee {

	public static void main(String[] args) {
		RegularEmployee re=new RegularEmployee(10,"Riya",45678);
		ContractorEmployee ce=new ContractorEmployee(13,"Riyaaa",45667);
		//Employeee e=new Employeee(15,"Riyaaaa",7656);
		Employeee employees[]= {re,ce};
		for(Employeee emp:employees) {
			System.out.println(emp);
			emp.payBonus();
			System.out.println(emp);
			
			
		}
		
	}

}
