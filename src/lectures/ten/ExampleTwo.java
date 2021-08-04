package lectures.ten;

import java.util.Scanner;

public class ExampleTwo {
	
	public static double pow(int b, int n) {
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 1.0 / pow(b, -n);
		}
		
		return b * pow(b, n-1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter some maths: (b^n) ");
		String in = input.nextLine();
		String[] values = in.split("\\^");
		int b = Integer.parseInt(values[0]);
		int n = Integer.parseInt(values[1]);
		System.out.println(pow(b, n));
	}

}
