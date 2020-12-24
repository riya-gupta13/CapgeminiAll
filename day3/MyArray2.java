package day3;
import day2.Employee;
public class MyArray2 {
	public static void printEmployee(Employee... emp) {
		for(Employee employees:emp) {
			System.out.println(employees);
		}
	}

	public static void main(String[] args) {
		Employee e2 = new Employee(44, "Priya", 34343.34);
		Employee e3=new Employee(34,"Riya", 4567.89);
		Employee e4=new Employee(65,"Riyaaaa",5678.9);
		Employee emp[]= {e2,e3,e4};
		for(Employee employees:emp) {
			
			 System.out.println(emp[1]);
		}
		printEmployee(e2);

	}

}
