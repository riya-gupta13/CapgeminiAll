package day7;

import java.util.Set;
import java.util.TreeSet;

public class VehicleTreeSet {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle(123,"Car","4 wheeler");
		Vehicle v2=new Vehicle(133,"Truck","6 wheeler");
		Vehicle v3=new Vehicle(113,"Bike","2 wheeler");
		Vehicle v4=new Vehicle(114,"Scooty","2 wheeler");
		Vehicle v6=new Vehicle(114,"Scooty","3 wheeler");
		Vehicle v5=new Vehicle(185,"Auto","3 wheeler");
		
		VehicleComparator vehiclecomparator=new VehicleComparator();
		Set<Vehicle> vehicles=new TreeSet<>(vehiclecomparator);
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
		vehicles.add(v5);
		vehicles.add(v6);
		//System.out.println(vehicles);
		
		for(Vehicle vehicle:vehicles) {
			System.out.println(vehicle);
			
		}
		
		

	}

}
