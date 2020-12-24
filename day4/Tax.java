package day4;

public class Tax {
   double grossIncome;
   String state;
   int dependants=1;
   
  public Tax(double grossIncome , String state) {
		super();
		this.grossIncome = grossIncome;
		this.state = state;
	}
   public Tax(double grossIncome, String state, int dependants) {
	this(grossIncome,state);     
	//this.grossIncome = grossIncome;
	//this.state = state;
	this.dependants = dependants;
}
public void calculateTax() {
	  if(dependants==1) {
		  this.grossIncome+=300;  
	  }
	  else if(dependants>1 && dependants<=5) {
		  this.grossIncome+=200;  
	  }
	  else {
		  this.grossIncome+=100; 
	  }
	   
   }

@Override
public String toString() {
	return "Tax [grossIncome=" + grossIncome + ", state=" + state + ", dependants=" + dependants + "]";
}


   
}
