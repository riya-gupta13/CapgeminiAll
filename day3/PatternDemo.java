package day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo { 
	public static void validatePassword(String pswrd) {
		String regex1 = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		//?= signifies atleast once
		Pattern pattern=Pattern.compile(regex1);
		Matcher matcher=pattern.matcher(pswrd);
		System.out.println(pswrd+ " " +matcher.matches());
		
	}
	public static void validateEmail(String email) {
		String regex="^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		System.out.println(email+ " " +matcher.matches());
		
	}
 
	public static void main(String[] args) {
		validateEmail("riyagupta@gmail.com");
		validatePassword("Riya#6788");
	}

}
