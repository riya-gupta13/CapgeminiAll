package labbook;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class LamdaString {
	/*public String getString(String str) {
		//String[] ch=str.split("");
		//char[] ch1=str.toCharArray(){
			
		}
	
//	}	
		
		/*for(i=0;i<ch.length;i++) {
		(ch[i])->System.out.println(ch[i]+" "+ch[i+1]);
	}
	return s;
	}*/

	public static void main(String[] args) {
		String str="Riya";
		//str.ins
		char[] ch=str.toCharArray();
		List li=new ArrayList<>();
		for(char c:ch) {
			li.add(c);
		//Consumer<String> consumer = (c)-> System.out.println(c+" ");;
		// li.stream().forEach(System.out.println(c+ " "+c));
		}
		

	}

}
