package day3;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PasswordGen {

	public static void main(String[] args) {
		System.out.println("Generate your Security Code");
		Scanner sc=new Scanner(System.in);
		String code=sc.next();
		String regex="^(.*[A-Z]){1}"
				+ "(.*[a-z]){1}"
				+ "(.*[0-9]){5}"
				+ "(.*[@#*]){1}$";
		Pattern pattern1=Pattern.compile(regex);
		Matcher matcher=pattern1.matcher(code);
		//System.out.println(p+ " " +matcher.matches());
		boolean b=matcher.matches();
		if(b==true) {
			System.out.println("Security Code Generated Successfully");
		}
		else {
			System.out.println("Invalid Security Code, Try Again!");
		}

	}

}
