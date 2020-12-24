package day7;

public class Vehicle implements Comparable<Vehicle> {
	
	Integer vehicleNumber;
	String vehicleName;
	String vehicleType;
	
	public Vehicle() {
		super();
	}
	
	

	public Vehicle(Integer vehicleNumber, String vehicleName, String vehicleType) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber 
				+ ", vehicleName=" + vehicleName 
				+ ", vehicleType=" + vehicleType + "]";
	}



	@Override
	public int compareTo(Vehicle o) {
		
		if(this.vehicleType.equals(o.vehicleType)) {
			return(this.vehicleNumber.compareTo(o.vehicleNumber));
		}
		
		return (this.vehicleType.compareTo(o.vehicleType));
	}

}
