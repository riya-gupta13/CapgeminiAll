package day5;

public class PlaneEngine extends Engine {
	int burst;
	public PlaneEngine(String make, int burst) {
		super(make);
		this.burst = burst;
	}
	public void fly() {
		System.out.println("it is Flying");
	}
	

}
