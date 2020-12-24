package day4;

public class Passenger {
	int ticketid;
	String name;
	String gender;
	String address;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Passenger(int ticketid, String name, String gender, String address) {
		super();
		this.ticketid = ticketid;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	public Passenger() {
		super();
	}
	@Override
	public String toString() {
		return "ticketid:" + ticketid + ", name:" + name + ", gender:" + gender + ", address:" + address
				+ " ";
	}
	

}
