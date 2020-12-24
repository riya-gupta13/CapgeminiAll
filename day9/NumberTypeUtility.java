package day9;

import java.util.Scanner;

public class NumberTypeUtility {
	public static NumberType isOdd() {
		NumberType num=(number)-> {return number%2!=0;};
		return num;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		isOdd();
		boolean b=isOdd().checkNumberType(n);
		if(b==true) {
			System.out.println(+n + " is odd");
		}
		else {
			System.out.println(+n + " is not odd");
		}
		

	}

}
