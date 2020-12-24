package day5;

public class Testshape {

	public static void main(String[] args) {
		
		Circle c=new Circle(12.34F);
		Rectangle r=new Rectangle(2.34F,5.67F);
		Triangle t=new Triangle(34.6F,23.67F);
		shape shapes[]= {c,r,t};
		for(shape s:shapes) {
			if(s instanceof Circle) {
				double d=s.calculateArea();
				System.out.println(d);
			}
			else if(s instanceof Rectangle) {
				double d= s.calculateArea();
				System.out.println(d);
			}
			else {
				double d= s.calculateArea();
				System.out.println(d);		
				}
		}
		
		

	}

}
