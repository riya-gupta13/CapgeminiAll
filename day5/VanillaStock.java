package day5;

public class VanillaStock extends Stock {
	String stockname;

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public VanillaStock(double price, String stockname) {
		super(price);
		this.stockname = stockname;
	}

	@Override
	public String toString() {
		return "VanillaStock [stockname=" + stockname + ", price=" + price + "]";
	}

	

	
	

}
