package day5;

public class BicycleImpl implements Bicycle{
	int gearNumber=2;
	int speed=20;
	public void applyBrakes(int decrement) {
		//decrement-=1;
		speed-=decrement;
		System.out.println("decrement:" +speed);
	}
	public void speedUp(int increment) {
		//increment+=1;
		speed+=increment;
		System.out.println("increment:" +speed);
	}
	public void changeGear(int newGearNumber) {
		newGearNumber+=gearNumber;
		System.out.println("changed gear:" +newGearNumber );
	}

}
