package lectures.two;

import java.util.Scanner;

public class ExampleSix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Max: ");
		int max = input.nextInt();
		System.out.println("Divisor: ");
		int d = input.nextInt();
		
		int current = 0;
		while (current <= max) {
			System.out.println(current);
			current+=d;
		}
	}

}
