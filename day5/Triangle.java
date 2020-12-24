package day5;

public class Triangle extends shape {
	float base;
	float height;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (0.5*base*height);
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", calculateArea()=" + calculateArea() + "]";
	}

	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}

}
