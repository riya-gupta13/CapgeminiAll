package day3;

import java.util.Scanner;

public class Interchangearray {

	public static void main(String[] args) {
		int i,n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in first array");
		n=sc.nextInt();
		int arr[]= new int[n];
		if(n>0) {
			System.out.println("Enter elements in first array");
			for(i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
		}
		else {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		System.out.println("Enter the number of elements in second array");
		m=sc.nextInt();
		int arr1[]= new int[m];
		if(m>0) {
			System.out.println("Enter elements second array");
			for(i=0;i<m;i++) {
				arr1[i]=sc.nextInt();
			}
		}
		else {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		
		if(n==m) {
			int temp[]=new int[n];
			for(i=0;i<n;i++) {
				if(arr[i]<=arr1[i]) {
					temp[i]=arr[i];
					arr[i]=arr1[i];
					arr1[i]=temp[i];
				}
			}
		}
		else {
			System.out.println("Unable to swap size differs");
			System.exit(0);
		}
		for(i=0;i<n;i++) {
			System.out.print("First array" +arr[i]);
		}
		for(i=0;i<n;i++) {
		System.out.print("second array" +arr1[i]);
		}
	}

}
