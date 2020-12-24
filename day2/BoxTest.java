package day2;

public class BoxTest {

	public static void main(String[] args) {
		Box b2=new Box(32,45,76);
		//Box b3=new Box(35,56,57);
		Box b4=new Box(32,45,76);
		Box b1=new Box();
		b1.setDepth(34);
		b1.setHeight(45);
		b1.setWidth(65);
		System.out.println(b2);
		System.out.println(b1.getDepth());
		System.out.println(b1.getHeight());
		System.out.println(b1.getWidth());
		if(b2.equals(b4)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		//System.out.println(b1.doubleheight());
	}

}
