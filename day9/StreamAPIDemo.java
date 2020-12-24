package day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamAPIDemo {

	public static void main(String[] args) {


		List<Employee> employees = new LinkedList<>();

		Employee e1= new Employee(1123, "Priya", "Negi", 84343.34);
		Employee e2= new Employee(112, "Amit", "Sharma", 44343.34);
		Employee e5= new Employee(112, "Amit", "Sharma", 44343.34);
		Employee e3= new Employee(11, "Saranya", "Raghav", 54343.34);
		Employee e4= new Employee(123, "Pankaj", "Tripathi", 64343.34);
		employees.add(e1);employees.add(e2);employees.add(e5);employees.add(e3);employees.add(e4);
		
		
//		select count(*) from employee where emp.salary> ?
		
		// Imperative
		int count = 0;
		for(Employee e: employees) {
			
			if(e.salary>40000) {
//				System.out.println(e);
				count ++;
				if(count == 3) break;
			}
		}
		System.out.println(count);
		
		//employees.stream()
		
		//Declarative
//		 employees.stream().parallel() // from employee
//		
////		.distinct()
//		.filter(e -> e.salary>40000) // where
////		.skip(2)
//		.forEach(System.out::println); // all employees
//		.count();
		 
//		System.out.println(total);
		 
		 //sorting
//        employees.stream()
//		 .sorted((o1,o2)-> o1.name.compareTo(o2.name))
//		 .forEach(System.out::println);
		
		//max min
		//OptionalDouble maxSalary = employees.stream()
	//	.filter(e -> e.salary >100000)	
//		number streams		
	//	.mapToDouble((e)  -> e.salary)
//		
//		//transformation
//		.map((e)  -> e.salary)
//		finding min without converting to number streams
//		.sorted((o1,o2)-> o1.salary.compareTo(o2.salary)).forEach(System.out::println);
////		
////		.forEach(System.out::println);
//		
//		System.out.println(maxSalary.getAsDouble());
		
	//reduce fxn to find total of all salaries
		Optional<Double> totalSalary = employees.stream()
				.map(e-> e.salary)
				.reduce((salary1, salary2)-> salary1+ salary2);
				
				System.out.println(totalSalary.get());
//				.sorted()
//				.filter(e->e.salary> 50000)
//				.map(e->e.name)
//				.forEach(System.out::println);
//				.max((o1,o2)-> o1.salary.compareTo(o2.salary));
//				.collect(Collectors.toList());
				
//				System.out.println(employeeWithMaxSalary.get());
//				
//				distinctEmployees.get(0).lastName;
				
				OptionalInt maxValue = IntStream.of().max();
				if(maxValue.isPresent()) {
					System.out.println(maxValue.getAsInt());
				}
				
 //  Optional<Employee> total = employees.stream().reduce((e1.salary,e2.salary) -> e1.salary + e2.salary);
 //  total.ifPresent(System.out::println);

//sorting using the comparable
   employees.stream().sorted();

		Stream<Integer> stream = Stream.of(10,20,30);
		OptionalDouble maxNumber = stream.mapToInt(o -> o).average();
		
		System.out.println(maxNumber);
		
//		stream.mapToInt()
		 
//		List<String> strs = new ArrayList<>();
//		strs.add("abc"); strs.add("xyz");
//		
//		Stream<String> stream = strs.stream();
//		stream.forEach(System.out::println);

	}

}