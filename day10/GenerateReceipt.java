package day10;

public class GenerateReceipt {
	
	public int verifyParty(Receipt r) {
		String s = r.transactionParty.seller;
		String b =r.transactionParty.buyer;
		int cnt = 0;
		if(s.matches("[a-zA-Z]+\b{1}[a-zA-Z]+[-\']{1}[a-zA-Z]+")){
			cnt++;
		}
		if(b.matches("[a-zA-Z]+\b{1}[a-zA-Z]+[-\']{1}[a-zA-Z]+")){
			cnt++;
		}
		return cnt;
		/*String regex="[a-zA-Z]+\\b{1}[a-zA-Z]+[-\\']{1}[a-zA-Z]+";
		String s=r.transactionParty.seller;
		String s2=r.transactionParty.buyer;
		int c=-1;
		if((s.matches(regex)) && (s2.matches(regex))) {
			 c=2;
		}
		else if((s.matches(regex)) || (s2.matches(regex))) {
			c=1;
		}
		else {
			c=0;
		}
		return c;*/
	}
	public String calcGST(Receipt r) {
		String[] x = (r.ProductsQR.split("\\W+"));
//		for(int i=0;i<x.length; i++) {
//			System.out.println(x[i]);}
		int sum = 0, GST_Rate = 12;
		for(int i=0;i<x.length-1;i=i+2) {
			int temp = Integer.parseInt(x[i])* Integer.parseInt(x[i+1]);
//			System.out.println(temp);
			sum = sum + temp;			
		}
//		System.out.println(sum);
		int GST = (sum*GST_Rate)/100;
//		System.out.println(GST);
		return Integer.toString(GST);	
	}
	public static void main(String[] args) {
		GenerateReceipt gr=new GenerateReceipt();
		TransactionParty tr=new TransactionParty( "sakshi kha'n", "saksh12");
		Receipt r=new Receipt(tr, "250,10@100,3@50,7");
		int v= gr.verifyParty(r);
		System.out.println(v);
		String calc=gr.calcGST(r);
		System.out.println(calc);
	}
}


