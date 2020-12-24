package day10;

public class Receipt {
	TransactionParty transactionParty;
	String ProductsQR;
	
	
	public Receipt(TransactionParty transactionParty, String productsQR) {
		super();
		this.transactionParty = transactionParty;
		this.ProductsQR = productsQR;
	}
	
	//=String.format("%d,%d@%d,%d@%d,%d", ProductsQR);

}
