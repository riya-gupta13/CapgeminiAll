package day5;

public class Bond implements Financial {
	public double price;
	public float interest;

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
	public void TotalPrice() {
		double total;
		total=this.price+interest;
		System.out.println(total);
	}

	public Bond(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bond [price=" + price + "]";
	}

	

}
