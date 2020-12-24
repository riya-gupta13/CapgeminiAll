package day7;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
	int empID; 
    String empName; 
    String deptName; 
  
    // Constructor for initializing the class variables 
    public ReverseList(int empID, String empName, String deptName) 
    { 
        this.empID = empID; 
        this.empName = empName; 
        this.deptName = deptName; 
    } 
  
    public static void main(String[] args) 
    { 
        // Declaring arraylist without any initial size 
        ArrayList<ReverseList> arrayli = new ArrayList<>(); 
  
        // Creating user defined objects 
        ReverseList emp1 = new ReverseList(123, "Rama", "Facilities"); 
        ReverseList emp2 = new ReverseList(124, "Lakshman", "Transport"); 
        ReverseList emp3 = new ReverseList(125, "Ravan", "Packing"); 
  
        // Appending all the objects for arraylist 
        arrayli.add(emp1); 
        arrayli.add(emp2); 
        arrayli.add(emp3); 
  
        System.out.print("Elements before reversing: "); 
        System.out.println(arrayli);
  
        // Collections.reverse method takes a list as a  
        // parameter and returns the reversed list 
        Collections.reverse(arrayli); 
        System.out.print("\nElements after reversing: "); 
        System.out.println(arrayli);
        //printElements(arrayli); 
    }

	@Override
	public String toString() {
		return "ReverseList [empID=" + empID + ", empName=" + empName + ", deptName=" + deptName + "]";
	} 
  
    // Iterate through all the elements and print 
   /* public static void printElements(ArrayList<Employee> alist) 
    { 
        for (int i = 0; i < alist.size(); i++) { 
            System.out.print("\n EmpID:" + alist.get(i).empID +   
            ", EmpName:" + alist.get(i).empName + ", Department:" +  
                                          alist.get(i).deptName); 
        } */
    
} 

