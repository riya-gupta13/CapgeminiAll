package day3;
import java.util.Arrays;
import java.util.List;
public class MyArray3 {

	public static void main(String[] args) {
		String s[]= {"mon", "tue", "wed", "thu"};
		String s1[]=new String[4];
		for(String str:s) {
			System.out.println(str);
		}
		Arrays.sort(s);
		int newarray=Arrays.binarySearch(s, "mon");
		System.out.println(newarray);
		
		List li=Arrays.asList(s);
		
		Arrays.copyOfRange(s1, 1,3);
		
		Arrays.equals(s, s1);
		
		Arrays.stream(s);
		
		//Arrays.fill(arg0, arg1);
		
	}

}
