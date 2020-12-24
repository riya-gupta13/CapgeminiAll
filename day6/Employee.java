package day6;

public class Employee {
	public static void Fullname(String frstname,String lstname) throws NameException{
		if(frstname==null || lstname==null) {
					
				throw new NameException("Enter your full name");
			}
	}
	public static void inputSalary(double salary) throws EmployeeException{
		if(salary<3000) {
			throw new EmployeeException("Salary less than 3000");
		}
	}
			
	public static void main(String[] args) throws Exception {
		
		try {
			Fullname("riya","null");
			inputSalary(2000);
		}
		catch(NameException e) {
			e.printStackTrace();
			System.out.println("handled exception");
		}
		catch (EmployeeException e) {
			e.printStackTrace();
			System.out.println("handled exception");
		}
		System.out.println("executed" );

	}

}
		
		