package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;



public class ArrayListEmployeeDemo {
	
	public static Employeee searchEmployee(List<Employeee> employees, int employeeId) {
		for(Employeee e: employees) {
			if(e.id == employeeId) {
				return e;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		List<Employeee> employees = new ArrayList<>();
		
		employees.add(new Employeee(12, "Ravi", 34343.34));
		employees.add(new Employeee(12, "Rahul", 34343.34));
		employees.add(new Employeee(11, "Priya", 64343.34));
		employees.add(new Employeee(2, "Arijit", 24343.34));
		employees.add(new Employeee(14, "Saranya", 74343.34));
		
		
//		ListIterator<Employee> iterator = employees.listIterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//			if(true) {
//				iterator.remove();
//			}
//		}
//		
		Employeee searchedEmployee = searchEmployee(employees, 2);
		System.out.println(searchedEmployee);
		
//		Collections.
		
//		Sorting lists
		// comparator will take precedence
		Collections.sort(employees , new SalaryComparator());
		
		System.out.println(employees);
		// anonymous class
		Collections.sort(employees, new Comparator<Employeee>() {
			@Override
			public int compare(Employeee o1, Employeee o2) {
				return o1.name.compareTo(o2.name);
			}
			
		});
		System.out.println(employees);
		
		
		
	}

}