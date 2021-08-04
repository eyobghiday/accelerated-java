package lectures.seven;

public class Triangle extends Polygon {
	
	private double base;
	private double height;
	
	public Triangle() {
		super(3);
		setBase(1.0);
		setHeight(1.0);
	}
	
	public Triangle(double base, double height) {
		this();
		setBase(base);
		setHeight(height);
	}
	
	public void setBase(double b) {
		if (b > 0) {
			this.base = b;
		}
	}
	
	public void setHeight(double h) {
		if (h > 0) {
			this.height = h;
		}
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		return "Triangle: " + base + ", " + height;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		} else if (!(o instanceof Triangle)) {
			return false;
		}
		
		Triangle t = (Triangle)o;
		
		if (Math.abs(this.base - t.getBase()) > 0.00001) {
			return false;
		} else if (Math.abs(this.height - t.getHeight()) > 0.00001) {
			return false;
		}
		
		return true;
	}

	@Override
	public double area() {
		return .5 * base * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
