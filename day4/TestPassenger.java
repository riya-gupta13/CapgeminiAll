package day4;

public class TestPassenger {

	public static void main(String[] args) {
		int n=2;
		for(int i=1;i<=n;i++) {
			System.out.println("Passenger " +i );
		}
		Passenger p=new Passenger(100,"Riya","f","fghj");
		Passenger p2=new Passenger(100,"Riya","f","fghj");
		System.out.println(p.toString());
		System.out.println(p2.toString());
	}

}
