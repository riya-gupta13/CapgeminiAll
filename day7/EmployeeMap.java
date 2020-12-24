package day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMap {
	public static void main(String[] agrs) {
		
	Map<Integer, String> employee=new HashMap<Integer, String>();
	employee.put(101, "Steve");
	employee.put(102,"Rob");
	employee.put(103,"Peter");
	employee.put(104,"mark");
	employee.put(105,"john");
	employee.put(106,"Tom");
	System.out.println(employee);
	
	Set<Integer> keySet=employee.keySet();

	for(Integer key:keySet) {
		System.out.println("keys:" +key);
		System.out.println(employee.get(key));
	}
	employee.remove(104);
	System.out.println(employee);
	}
	

}
