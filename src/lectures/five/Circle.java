package lectures.five;

public class Circle {

	private double radius;	// The radius of this circle
	
	private static double pi = 3.14;	// Value to use for Pi
	
	// default constructor
	public Circle() {
		radius = 1;
	}
	
	// non-default constructor
	public Circle(double r) {
		this();	// calls default constructor first
		setRadius(r);	// tries to set radius
	}
	
	// mutator for radius
	public void setRadius(double r) {
		if (r > 0) {	// only set radius if positive
			radius = r;
		}
	}
	
	// accessor for radius
	public double getRadius() {
		return radius;
	}
	
	// string of this circle
	public String toString() {
		return "Circle of radius: " + radius;
	}
	
	
	// Are their radii 'close enough'
	public boolean equals(Circle c) {
		return Math.abs(radius - c.getRadius()) < 0.001;
	}
	
	// area of the circle
	public double area() {
		return pi * radius * radius;
	}
	
	// perimeter of the circle
	public double circumference() {
		return 2 * pi * radius;
	}
	
	// modify our value for pi
	public static void setPi(double p) {
		if (p >= 3 && p < 3.15) {
			pi = p;
		}
	}
	
	// get our value of pi
	public static double getPi() {
		return pi;
	}
	
}
