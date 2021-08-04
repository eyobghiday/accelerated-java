package lectures.one;

import java.util.Scanner;

public class ExampleFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter something: ");
		String word = input.nextLine();
		
		switch (word) {
			case "apple":
			case "Apple":
				System.out.println("You entered apple...");
				break;
			case "banana":
			case "Banana":
				System.out.println("You entered banana...");
				break;
			default:
				System.out.println("You did not enter apple or banana...");
		}
	}

}
