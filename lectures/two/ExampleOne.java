package lectures.two;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		
		String userInput = input.nextLine();
		
		while (!"exit".equalsIgnoreCase(userInput)) {
			// Process user option
			System.out.println(userInput);
			/// Get next value
			System.out.println("Enter your next choice: ");
			userInput = input.nextLine();
		}
		
		System.out.println("Goodbye");
	}

}
