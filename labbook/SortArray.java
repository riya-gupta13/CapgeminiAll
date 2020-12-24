package labbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {
	public Integer[] getSorted(Integer[] a) {
		List<Integer> arr=Arrays.asList(a);
		Collections.reverse(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		Integer[] aa= (Integer[]) arr.stream().toArray();
		
		return aa;
	}
	
	public static void main(String[] args) {
		Integer[] a=new Integer[] {10,40,12,65,43};
		List<Integer> arr=Arrays.asList(a);
		Collections.reverse(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		
	}

}
