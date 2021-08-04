package lectures.two;

import java.util.Scanner;

public class ExampleSixB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Max: ");
		int max = input.nextInt();
		System.out.println("Divisor: ");
		int d = input.nextInt();
		
		for (int current = 0; current <= max; current+=d) {
			System.out.println(current);
		}
	}

}
