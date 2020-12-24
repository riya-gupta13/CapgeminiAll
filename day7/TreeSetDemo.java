package day7;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		//sorted .. the objects should be comparable -- implementing comparable interface
		
		// defining new criteria for comparison basis salary
		SalaryComparator salaryComparator = new SalaryComparator();
		Set<Employeee> employees = new TreeSet<>(salaryComparator);
		employees.add(new Employeee(12, "Ravi", 34343.34));
		employees.add(new Employeee(12, "Rahul", 34343.34));
		employees.add(new Employeee(11, "Priya", 64343.34));
		employees.add(new Employeee(2, "Arijit", 24343.34));
		employees.add(new Employeee(14, "Saranya", 74343.34));
		
		System.out.println(employees);
		
		Employeee e1 = new Employeee(145, "Ravi", 34343.34);
		Employeee e2 = new Employeee(12, "Ravi", 34343.34);
		
		System.out.println(e1.compareTo(e2));
		
		// sorted
//		Set<String> fruits = new TreeSet<>();
		
		Set<Fruit> fruits = new TreeSet<>();
		fruits.add(new Fruit("orange"));
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("pineapple"));
		
		System.out.println(fruits);
		
		for(Fruit f : fruits) {
			System.out.println(f);
		}
		
	}

}