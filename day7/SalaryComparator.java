package day7;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employeee> {


	@Override
	public int compare(Employeee o1, Employeee o2) {
		return o1.salary.compareTo(o2.salary);
	}

}