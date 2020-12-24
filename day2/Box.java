package day2;

public class Box {
	public double height;
	public double width;
	public double depth;
	
	 public void doubleheight() {
		 this.height=height*2;
	 }
	public Box() {
		System.out.println("hyiii");
	}
	public Box(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	//public boolean equals(Object obj) {
	//	Box b=(Box) obj;
		
	
	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;*/
		Box other = (Box) obj;
		if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double calcvolume() {
		return (depth * height * width);
	}
	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", depth=" + depth + "]";
	}

	

}
