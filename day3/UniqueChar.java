package day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class UniqueChar {

	public static void main(String[] args) {
		int flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		//String regex="[^a-zA-Z\s]*";
		//boolean b=str.matches(regex); 
		//if(str.matches(regex)) {	
		
		String [] chars = str.split(" "); 
		//Set<String> uniqueChars = new LinkedHashSet<>(); 
		List<String> uniqueCharss=new ArrayList<>();
		
		for (String s : chars) { 
			uniqueCharss.add(s); 
		} 
		System.out.println(uniqueCharss);
		//}
		//else {
			//System.out.println("not valid");
		//}
		
		//Stream.of(chars) 
		
		
		long count1= uniqueCharss.stream()
				  .count();
				 System.out.println("number of words " +count1);
				 
		 long count= uniqueCharss.stream()
		  .distinct()
		  .count();
		 System.out.println("number of distinct words " +count);
		 
		 uniqueCharss.stream().distinct().forEach(s -> System.out.println(s + " ")); 
			
			
	}

}
