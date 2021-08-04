package lectures.two;

import java.util.Scanner;

public class ExampleEight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a size: ");
		int size = input.nextInt();
		
		for (int row=0; row < size; row++) {
			for (int col=0; col < size; col++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}
