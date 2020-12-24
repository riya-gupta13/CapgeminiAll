package day3;

public class MyArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int arr1[]= {1,2,3,4};
		String week[]= {"mon", "tue"};
		String week1[]=new String[3];
		
		for(int i:arr) {
			arr[i]=i+1;
			//System.out.println(i);
			System.out.println(arr[i]);
		}
		for(int j:arr1) {
			System.out.println(j);
			//System.out.println(arr1[j]);
		}
		for(String weekday:week) {
			System.out.println(weekday);
		}
		week1[0]= new String("orange");
		week1[1]= new String("apple");
		week1[2]= new String("mango");
		for(String weekd:week1) {
		
			System.out.println(weekd);
		}
		System.out.println(week1[1]);
		arr[1]=arr1[3];

	}

}
