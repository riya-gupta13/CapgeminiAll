package day5;

public class Plane extends Vehicle {
	int maxaltitude;
	public Plane(int maxspeed, String color, Engine engine, int maxaltitude) {
		super(maxspeed, color, engine);
		this.maxaltitude = maxaltitude;
	}
	public void start() {
		System.out.println("it is starting for plane");
	}
	@Override
	public String toString() {
		return "Plane [maxaltitude=" + maxaltitude + ", maxspeed=" + maxspeed + ", color=" + color + ", getEngine()="
				+ getEngine() + "]";
	}

}
