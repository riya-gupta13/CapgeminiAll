package day5;
import java.lang.Math.*;

public class Circle extends shape{
	float radius;
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", calculateArea()=" + calculateArea() + "]";
	}
	public double calculateArea() {
		//double area;
		return (Math.PI*radius*radius);
	}

}
