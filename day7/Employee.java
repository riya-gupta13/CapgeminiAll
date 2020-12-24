package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Employee {
	String name;
	int id;
	int age;
	public Employee(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}	
	

  @Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
  

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {

	Employee other = (Employee) obj;
	if (age != other.age)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}



public static void main(String[] args) {
	  
	List<String> employees=new ArrayList<>();
	//List<Employee> al=new ArrayList<Employee>();
	//ArrayList<Employee> a=new ArrayList<Employee>();
	//al.add(new Employee("riya",134,12));
	employees.add("Riya");
	employees.add("dfgh");
	employees.add("asdf");
	System.out.println(employees);
	employees.remove(2);
	System.out.println(employees);
	System.out.println(employees.get(0));
	
	
	List<Employee> employes =new LinkedList<Employee>();
	Employee e=new Employee("riya",134,12);
	Employee e1=new Employee("riyaaaa",164,23);
	Employee e2=new Employee("priya",135,45);
	Employee e3=new Employee("ria",934,34);
	employes.add(e);
	employes.add(e1);
	employes.add(e2);
	
	System.out.println(employes);
	System.out.println(employes.remove(1));
	System.out.println(employes);
	System.out.println(employes.get(0));
	
	
	Set<Employee> employee=new HashSet<Employee>();
	//Set<Object> employee=new HashSet<Object>();
	employee.add(e3);
	employee.add(e2);
	employee.add(e1);
	employee.add(e);
	//employee.add(employes);
	employee.add(new Employee("riaaa",111,45));
	System.out.println(employee);
	//System.out.println(employee.contains(employes));
	System.out.println(employee.contains(e2));
	System.out.println(employee.contains(new Employee("riaaa",111,45)));
	employee.remove(e);
	System.out.println(employee);
	//we can also define hashcode or equals for a particular attribute
	//we can check if we have same object value thn we'll get same hashcode
	
	
	
	
  }






}
