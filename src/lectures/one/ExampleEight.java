package lectures.one;

import java.util.Scanner;

public class ExampleEight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String input = scan.nextLine();
		
		if (input.compareToIgnoreCase("maybe") < 0) {
			System.out.println(input + " comes before maybe alphabetically...");
		} else if (input.compareToIgnoreCase("maybe") > 0) {
			System.out.println(input + " comes after maybe alphabetically...");
		} else {
			System.out.println(input + " is maybe");
		}
	}

}
