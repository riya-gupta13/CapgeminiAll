package day5;

public class PreferredStock extends Stock {
	String stockname;

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public PreferredStock(double price, String stockname) {
		super(price);
		this.stockname = stockname;
	}

	@Override
	public String toString() {
		return "PreferredStock [stockname=" + stockname + ", price=" + price + "]";
	}

	

	

}
