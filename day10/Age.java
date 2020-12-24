package day10;

public class Age {
	String drink;
	String vote;
	String movie;
	
	public String drinkingCheck (Age a, int age) {
		try {
			if(age<21) {
				a.drink="Illegal";
				throw new IllegalAgeException("Illegal drinking age");
			}
			else {
				a.drink="legal";
			}
		}
		catch(IllegalAgeException e) {
			//e.printStackTrace();
			System.out.println("handled exception for drinking " +age);
		}
		return a.drink;
	}
	
	public String votingCheck(Age a, int age) {
		try {
			if(age<18) {
				a.vote="Illegal";
				throw new IllegalAgeException("Illegal voting age");
			}
			else {
				a.vote="legal";
			}
		}
		catch(IllegalAgeException e) {
			//e.printStackTrace();
			System.out.println("handled exception for voting " +age);
		}
		return a.vote;			
	}
	public String movieCheck(Age a, int age) {
		try {
			if(age<14) {
				a.movie="Illegal";
				throw new IllegalAgeException("Illegal movie-watching age");
			}
			else {
				a.movie="legal";
			}
		}
		catch(IllegalAgeException e) {
			//e.printStackTrace();
			System.out.println("handled exception for movie " +age);
		}
		return a.movie;
		
	}

	public static void main(String[] args) throws IllegalAgeException {
		Age a=new Age();
		a.drinkingCheck(a, 20);
		a.votingCheck(a, 17);
		a.movieCheck(a, 13);

	}

}
