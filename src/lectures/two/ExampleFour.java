package lectures.two;

import java.util.Scanner;

public class ExampleFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean running = true;
		do {
			System.out.println("Enter a letter: ");
			String choice = input.nextLine();
			
			switch (choice.toLowerCase()) {
				case "a":
					System.out.println("Apple");
					break;
				case "b":
					System.out.println("Banana");
					break;
				case "c":
					System.out.println("Cherry");
					break;
				case "d":
					System.out.println("Dragon Fruit");
					break;
				case "e":
					running = false;
					break;
				default:
					System.out.println("Sorry I don't know any words that start with " + choice);
					running = false;
			}
		} while (running);
		
		System.out.println("Goodbye");
	}

}
