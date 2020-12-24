package day5;

public class TestVehicle {

	public static void main(String[] args) {
		Engine engine=new Engine("Car");
		Engine e=new Engine("Plane");
		
		Vehicle v=new Plane(10,"Red", engine,32);
		
		Car c=new Car();
		c.setEngine(e);
		c.setMaxspeed(23);
		c.setColor("blue");
		
		PlaneEngine p=new PlaneEngine("plane", 40);
		
		engine.startEngine();
		System.out.println("for engine " +engine);
		
		v.start();
		System.out.println("for plane with ref to vehicle " +v);
		
		c.start();
		System.out.println("for car " +c);
		
		p.fly();
		System.out.println("for planeEngine " +p);
	}

}
