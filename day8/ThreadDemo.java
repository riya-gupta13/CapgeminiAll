package day8;

import java.util.ArrayList;
import java.util.List;

import day7.Employeee;

public class ThreadDemo {

	public static void main(String[] args) {
		
		List<Employeee> employees = new ArrayList<>();
		
		employees.add(new Employeee(12, "Ravi", 34343.34));
		employees.add(new Employeee(12, "Rahul", 34343.34));
		employees.add(new Employeee(11, "Priya", 64343.34));
		employees.add(new Employeee(2, "Arijit", 24343.34));
		employees.add(new Employeee(14, "Saranya", 74343.34));
		long startTime = System.currentTimeMillis();
		// operation on a bulk 
		for(Employeee e: employees) {
			e.incrementSalary();
			System.out.println(e);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time taken to process: " + (endTime - startTime));
		
		
		

	}

}