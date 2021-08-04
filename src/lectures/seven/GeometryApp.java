package lectures.seven;

public class GeometryApp {

	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = new Circle();
		s[1] = new Triangle();
		s[2] = new Triangle(1,2);
		
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i].toString());
			System.out.println(s[i].area());
		}
	}

}
