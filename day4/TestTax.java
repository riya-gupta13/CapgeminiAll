package day4;

public class TestTax {

	public static void main(String[] args) {
		Tax t=new Tax(20000,"Punjab");
		Tax t1=new Tax(10000,"Rajasthan",2);
		Tax t2=new Tax(15000,"MP",7);
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		t.calculateTax();
		t1.calculateTax();
		t2.calculateTax();
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);

	}

}
