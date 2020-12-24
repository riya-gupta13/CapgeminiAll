package day9;


public class TestDisplayText {
	public static DisplayText welcomeMessage() {
		DisplayText d= (text)-> {System.out.println("Welcome " +text);};	
		return d;
	}


	public static void main(String[] args) {
		welcomeMessage();
		String str= welcomeMessage().getInput();
		welcomeMessage().displayText(str);
		
		

	}

}
