package day5;

public class Rectangle extends shape {
	float length;
	float breadth;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", calculateArea()=" + calculateArea() + "]";
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}
