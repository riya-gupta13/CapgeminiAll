package day9;

import java.util.Scanner;
@FunctionalInterface
public interface DisplayText {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	public void displayText(String text);
	
	public default String getInput() {
		//String s=null;
		return s;
	}

}
