package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo extends Problem1Employee{
	
	public EmployeeInfo(String name, int salary) {
		super(name, salary);
		
	}

	enum SortMethod {BYNAME, BYSALARY;}
	
	
	//public List<Problem1Employee> sort(List<Problem1Employee> emps, final SortMethod method){
		//List<Problem1Employee> emp=new ArrayList<>();
		//emps.stream().sorted((e1,e2)-> e1.SortMethod.compareTo(e2.SortMethod));
		/*Collections.sort(emps, new Comparator<Problem1Employee>(){

			@Override
			public int compare(Problem1Employee o1, Problem1Employee o2) {
				
				return o1.name.compareTo(o2.name);
			}	
		});
		final  SortMethod method() {
			Collections.sort(emps, new Comparator<Problem1Employee>(){

				@Override
				public int compare(Problem1Employee o1, Problem1Employee o2) {
					
					return o1.salary.compareTo(o2.salary);
				}	
			});
			
		}*/
	//public boolean isCharacterPresentInAllNames(Collection<Problem1Employee> entities, String character){
		//List<String> names=new ArrayList<>();
		//entities.
			//entities.stream().filter(e.name.startsWith("character")));
			
			
		}
		
		
	
//}
