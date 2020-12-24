package day5;

public class Stock implements Financial {
	public double price;

	public Stock(double price) {
		super();
		this.price = price;
	}
	public void TotalPrice() {
		double total;
		total=this.price;
		System.out.println(total);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
