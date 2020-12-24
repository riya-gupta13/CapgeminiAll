package day5;

public abstract class Bicyclee {
	
	int speed;
	
	
	
	public Bicyclee(int speed) {
		super();
		this.speed = speed;
	}

	// common in all subclasses or implementation
	public void speedDown() {
		--this.speed;
	}

	public abstract void speedUp() ;



	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + "]";
	}
	

}