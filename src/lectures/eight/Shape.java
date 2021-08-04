package lectures.eight;

public abstract class Shape implements Comparable {

	public Shape() {
		super();
	}
	
	public abstract double area();
	
	public abstract double perimeter();
	
	@Override
	public int compareTo(Object obj) {
		if (!(obj instanceof Shape)) {
			return 0;
		}
		
		Shape s = (Shape) obj;
		return (int)(10000 * (s.area() - this.area()));
	}
	
}
