package day5;

interface Loan
{
     double issueeLoan(double salary);

     double repayLoan(double loanAmt,double amount);

}



public class Student implements Loan

{
     public double issueeLoan(double salary) {

         System.out.println("Issue Loan");

         return salary * 0.10;

     }	

     public double repayLoan(double loanAmt,double amount) {

         System.out.println("Repay Loan");

         return loanAmt - amount;

     }	
public static void main (String[] args) {
	Student e = new Student();
	 double d=e.issueeLoan(500000);//line 4
	 System.out.println(d);
	}
	}
