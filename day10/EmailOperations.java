package day10;

public class EmailOperations {
	public int emailVerify(Email e) {
		String f= e.header.from;
		String t=e.header.to;
		String regex="^(.+)@(.+)$";
		if(f.matches(regex) && t.matches(regex)) {
			return 2;
		}
		else if(f.matches(regex) || t.matches(regex)) {
			return 1;
		}
		else
			return 0;
	}
	
	public String greetingMessage(Email e) {
		String g=e.greetings;
		String n=e.header.from;
		int i=n.indexOf("@");
		String str=n.substring(0, i);
		return g+" "+ str;
		
	}

	public static void main(String[] args) {
		EmailOperations email=new EmailOperations();
		Header h=new Header("riya@gmail.com", "amit@fghj.com");
		Email e=new Email(h, "hey", "Regards");
		
		int r=email.emailVerify(e);
		System.out.println(r);
		String s=email.greetingMessage(e);
		System.out.println(s);

	}

}
