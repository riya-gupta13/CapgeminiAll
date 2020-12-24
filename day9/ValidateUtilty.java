package day9;

import java.util.Scanner;


public class ValidateUtilty {
	public static Validate validateEmployeeName() {
		String regex="[a-zA-Z]{5,20}";
		Validate v=(name)-> {return name.matches(regex);};
		return v;
}	
	public static Validate validateProductName() {
		String regex1="[a-zA-Z]{1}[0-9]{5}";
		Validate v1=(name)-> {return name.matches(regex1);};
		return v1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String str=sc.next();
		boolean e=validateEmployeeName().validateName(s);
		if(e==true) {
			System.out.println("employee name is valid");
		}
		else
		{
			System.out.println("employee name is not valid");
		}
		boolean p=validateProductName().validateName(str);
		if(p==true) {
			System.out.println("product name is valid");
		}
		else
		{
			System.out.println("product name is not valid");
		}
		

	}

}
