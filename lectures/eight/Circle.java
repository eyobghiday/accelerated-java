package lectures.eight;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {
		super();
		setRadius(1.0);
	}
	
	public Circle(double r) {
		this();
		setRadius(r);
	}
	
	public void setRadius(double r) {
		if (r > 0) {
			this.radius = r;
		}
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return "Circle: " + radius;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Circle)) {
			return false;
		}
		
		Circle c = (Circle)o;
		if (Math.abs(this.radius - c.getRadius()) > 0.00001) {
			return false;
		}
		
		return true;
	}

	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public double circumference() {
		return perimeter();
	}

}
