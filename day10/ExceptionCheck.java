package day10;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExceptionCheck {
	/*public ArrayList<String> numberCheck(String str){
		ArrayList<String> arr=new ArrayList<String>();
		try {
			String regex="[0-9]";
			String s1[]=str.split(regex);
			for(String s:s1) {
			arr.add(s);
	/*		}
		//	throw new NumberFormatException("aded");
		//	System.out.println(arr);
	//		}/*
		//catch(NumberFormatException e) {
			System.out.println("handled exception" +str);
		}
		return arr;
	}/*
	
	/*public String fileCheck(String filename) {
		try 
		{
		//This already throws FileNotFoundException
		  //br = new BufferedReader(new FileReader(filename));
			readFile();
		} 
		catch(FileNotFoundException e)
		{
		  e.printStackTrace();
		}
		return filename;
	}
*/
	public static void main(String[] args) {
		ExceptionCheck e=new ExceptionCheck();
		//e.numberCheck("10ASD");

	}

}
