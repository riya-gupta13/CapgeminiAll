package day5;

public abstract class Vehicle {
	int maxspeed;
	String color;
	private Engine engine;
	
	public Vehicle(int maxspeed, String color, Engine engine) {
		super();
		this.maxspeed = maxspeed;
		this.color = color;
		this.engine = engine;
	}
	

	public Vehicle() {
		super();
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public  void start() {
		this.engine.startEngine();
		System.out.println("vehicle started");
		
	}
	@Override
	public String toString() {
		return "Vehicle [maxspeed=" + maxspeed + ", color=" + color + ", engine=" + engine + "]";
	}
	

}
