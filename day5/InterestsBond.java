package day5;

public class InterestsBond extends Bond {
	String bondname;
	
	
	public InterestsBond(double price, String bondname) {
		super(price);
		this.bondname = bondname;
	}


	@Override
	public String toString() {
		return "InterestsBond [price=" + price + ", interest=" + interest + "]";
	}
	
	

}
