package day7;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	List<Contact> phoneBook=new ArrayList<>();

	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	public void addContact(Contact contactObj) {
		this.phoneBook.add(contactObj);
	}
	public List<Contact> viewAllContacts(){
		return this.getPhoneBook();
	}
	public Contact viewContactGivenPhone(long phoneNumber) {
		Contact contact=null;
		for(Contact c:this.phoneBook) {
			if(c.getPhoneNumber()==phoneNumber) {
				contact=c;
			}
		}
				return contact;
		}	
	   public boolean removeContact(long phoneNumber) {
		   boolean f=false;
		   for(Contact c:this.phoneBook) {
				if(c.getPhoneNumber()==phoneNumber) {
					this.getPhoneBook().remove(c);
					f=true;
				}
		   }
			return f;
	   }
	}
	


