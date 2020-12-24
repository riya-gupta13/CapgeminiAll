package day7;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		
		return (o1.vehicleName.compareTo(o2.vehicleName));
	}

}
