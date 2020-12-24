package day5;

public class RoadBicycle extends Bicyclee{

	public RoadBicycle(int speed) {
		super(speed);
		
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}
	
	public void speedUp() {
		this.speed += 1;
		
	}
	
	

}