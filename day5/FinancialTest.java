package day5;

public class FinancialTest {

	public static void main(String[] args) {
		ZeroBond z=new ZeroBond(6000, "zero");
		//z.interest(15);
		
		InterestsBond i=new InterestsBond(8000,"interest");
		//i.interest(20);
		
		VanillaStock v=new VanillaStock(7000, "vanilla");
		
		PreferredStock p=new PreferredStock(4000, "Preferred");
		
		//Bond bonds[]= {z,i};
		
		//Stock s[]= {v,p};
		Financial f[]= {z,i,v,p};
		
		for(Financial b: f) {
			if(b instanceof Bond) {
				System.out.println("for bond");
				b.TotalPrice();
			}
			else {
				System.out.println("for stock");
				b.TotalPrice();
			}
		}
		
		

	}

}
