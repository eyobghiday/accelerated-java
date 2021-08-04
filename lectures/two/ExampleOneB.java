package lectures.two;

import java.util.Scanner;

public class ExampleOneB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String userInput;
		
		do {
			// Get next value
			System.out.println("Enter your next choice: ");
			userInput = input.nextLine();
			
			// Process user option
			if (!"exit".equalsIgnoreCase(userInput)) {
				System.out.println(userInput);
			}
		} while (!"exit".equalsIgnoreCase(userInput));
		
		System.out.println("Goodbye");
	}

}
