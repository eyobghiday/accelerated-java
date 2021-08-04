package lectures.one;

import java.util.Scanner;

public class ExampleSix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String userWord = input.nextLine();
		
		if (userWord.equalsIgnoreCase("Hello")) {
			System.out.println("Hello");
		} else {
			System.out.println("I'm sorry, I didn't understand that.");
		}
	}

}
