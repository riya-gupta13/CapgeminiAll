package day5;

public class Engine {
	String make;
	public void startEngine() {
		System.out.println("for engine in progess");
	}
	public Engine(String make) {
		super();
		this.make = make;
	}
	@Override
	public String toString() {
		return "Engine [make=" + make + "]";
	}
}
