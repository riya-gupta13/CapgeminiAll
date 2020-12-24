package day3;

import java.util.Scanner;
import java.util.Arrays;

public class Temp {

	public static void main(String[] args) {
		double average=0;
		int  arr[]= new int[15];
		//also we can simply enter the values too and not use scanner
		System.out.println("enter 15 elements ");
		for(int i=0;i<=15;i++) {
			Scanner sc=new Scanner(System.in);
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=15;i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println(arr[14]);
		
		for(int i=0;i<=15;i++) {
			average=average+arr[i];
		}
		average=average/15;
		System.out.println("Average is:" +average);
		

	}

}
