package day3;
import java.util.*;
//import java.io.*;
public class StringClass {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		//String str1= sc.next();
		System.out.println("string is: " +str);
		//System.out.println("string is:"+str1);
		
		
		StringBuilder s= new StringBuilder();
		
		
		s.append(str).reverse();
		System.out.println("reversed string: " +s.toString());
		
		
		StringBuilder s1= new StringBuilder("Good Morning");
		s1.reverse();
		System.out.println("reversed "+s1.toString());
		
	}

}
