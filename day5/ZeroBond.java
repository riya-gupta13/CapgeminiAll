package day5;

public class ZeroBond extends Bond {
	String bondname;
	public ZeroBond(double price, String bondname) {
		super(price);
		this.bondname = bondname;
	}
	@Override
	public String toString() {
		return "ZeroBond [bondname=" + bondname + ", price=" + price + ", interest=" + interest + "]";
	}

}
