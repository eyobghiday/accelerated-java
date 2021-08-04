package lectures.five;

public class Geometry {

	public static void main(String[] args) {
		// Create default circle
		Circle c1 = new Circle();
		System.out.println(c1.area());
		System.out.println(c1.circumference());
		System.out.println(Circle.getPi());
		
		// modify pi
		c1.setPi(3.142);
		
		// See changes because of pi change
		System.out.println(c1.area());
		System.out.println(c1.circumference());
		System.out.println(Circle.getPi());
		
		
		// observe change in new circle
		Circle c2 = new Circle(2);
		System.out.println(c2.area());
		System.out.println(c2.circumference());
	}

}
