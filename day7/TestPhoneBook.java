package day7;

import java.util.Scanner;

public class TestPhoneBook {
	public static void displayoptions() {
		System.out.println("MENU");
		System.out.println("1. Add Contact");
		System.out.println("2. Display All Contacts");
		System.out.println("3. View Contact by Phone");
		System.out.println("4. Remove Contact");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");		
	}
	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		Contact c=new Contact();
		PhoneBook ph=new PhoneBook();
		while(true) {
			displayoptions();
			choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter your First Name:");
			String f=sc.next();
			System.out.println("Enter your Last Name:");
			String l=sc.next();
			System.out.println("Enter the phone number");
			Long p=sc.nextLong();
			System.out.println("Enter Email:");
			String e=sc.next();
			Contact c1=new Contact(f,l,p,e);
			ph.addContact(c1);	
		}
		else if(choice==2) {
			System.out.println("The contacts in the list are:");
			for(Contact c1: ph.viewAllContacts()) {
			System.out.println("First Name: "+c1.getFirstname());
			System.out.println("Last Name: "+c1.getLastname());
			System.out.println("Phone No: "+c1.getPhoneNumber());
			System.out.println("Email Id: "+c1.getEmailId());	
			}
		}
		else if(choice==3) {
			System.out.println("Enter the Phone number to search by contact " );
			long p=sc.nextLong();
			System.out.println(ph.viewContactGivenPhone(p));
			System.out.println("First Name: "+c.getFirstname());
			System.out.println("Last Name: "+c.getLastname());
			System.out.println("Phone No: "+c.getPhoneNumber());
			System.out.println("Email Id: "+c.getEmailId());
			//System.out.println(p);
	}
		else if(choice==4) {
			System.out.println("Enter the phone number to remove:");
			long p=sc.nextLong();
			System.out.println("Do you want to remove(Y/N):");
			char n=sc.next().charAt(0);
			boolean r=false;
			if(n=='Y') {
				r=ph.removeContact(p);
			}
				if(r==true) {
				System.out.println("contact deleted");
			}
			else {
				System.out.println("not exist");
			}
		}
		else {
			System.exit(0);
		}
		}

	}
}


