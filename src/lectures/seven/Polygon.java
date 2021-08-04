package lectures.seven;

public abstract class Polygon extends Shape {

	private int sides;
	
	public Polygon() {
		super();
		setSides(3);
	}
	
	public Polygon(int s) {
		this();
		setSides(s);
	}
	
	public void setSides(int s) {
		if (s >= 3) {
			this.sides = s;
		}
	}

	public int getSides() {
		return this.sides;
	}
	
	public String toString() {
		return "Polygon: " + sides;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Polygon)) {
			return false;
		}
		
		Polygon p = (Polygon) o;
		if (this.sides != p.getSides()) {
			return false;
		}
		
		return true;
	}
}
