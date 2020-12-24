package day5;

public class BicycleTest {

	public static void main(String[] args) {
		BicycleImpl b=new BicycleImpl();
		Bicycle b2=new BicycleImpl();
		b.applyBrakes(4);
		b2.speedUp(10);
		b.changeGear(3);
		//System.out.println(b);

	}

}
